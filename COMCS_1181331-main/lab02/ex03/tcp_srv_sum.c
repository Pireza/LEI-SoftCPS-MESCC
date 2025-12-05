#include <arpa/inet.h>
#include <netdb.h>
#include <netinet/in.h>
#include <stdint.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/types.h>
#include <unistd.h>
#define BUF_SIZE 300
#define SERVER_PORT "9999"
#define MESSAGE_SIZE 128

struct KeyValuePair {
  uint32_t key;
  uint32_t value;
  struct KeyValuePair *next;
};

void addKeyValuePair(struct KeyValuePair *pair, uint32_t key, uint32_t value) {
  pair->key = key;
  pair->value = value;
  pair->next = NULL;
  return;
};

struct KeyValueStore {
  int capacity;
  struct KeyValuePair **keyValuePairs;
};

void initializeKeyValueStore(struct KeyValueStore *store) {
  store->capacity = 100;

  store->keyValuePairs = (struct KeyValuePair **)malloc(
      sizeof(struct KeyValuePair *) * store->capacity);
  return;
};

uint32_t hash(uint32_t x) {
  x = ((x >> 16) ^ x) * 0x45d9f3bu;
  x = ((x >> 16) ^ x) * 0x45d9f3bu;
  x = (x >> 16) ^ x;
  return x;
};

int insert(struct KeyValueStore *store, uint32_t key, uint32_t value) {
  int bucketIndex = hash(key) % store->capacity;

  struct KeyValuePair *newNode =
      (struct KeyValuePair *)malloc(sizeof(struct KeyValuePair));

  addKeyValuePair(newNode, key, value);

  if (store->keyValuePairs[bucketIndex] == NULL) {
    store->keyValuePairs[bucketIndex] = newNode;
  } else {
    newNode->next = store->keyValuePairs[bucketIndex];
    store->keyValuePairs[bucketIndex] = newNode;
  }
  return 1;
};

int delete(struct KeyValueStore *store, uint32_t key) {
  int bucketIndex = hash(key) % store->capacity;

  struct KeyValuePair *prev = NULL;

  struct KeyValuePair *curr = store->keyValuePairs[bucketIndex];

  while (curr != NULL) {
    if (key == curr->key) {
      if (curr == store->keyValuePairs[bucketIndex]) {
        store->keyValuePairs[bucketIndex] = curr->next;
      } else {
        prev->next = curr->next;
      }
      free(curr);
      break;
    }
    prev = curr;
    curr = curr->next;
  }
  return 1;
};

uint32_t get(struct KeyValueStore *store, uint32_t key) {
  int bucketIndex = hash(key) % store->capacity;

  struct KeyValuePair *bucketHead = store->keyValuePairs[bucketIndex];
  while (bucketHead != NULL) {
    if (bucketHead->key == key) {
      return bucketHead->value;
    }
    bucketHead = bucketHead->next;
  }

  return -1;
};

struct KeyValueStore *keyValueStore;

enum RequestType { INSERT, GET, DELETE, EXIT };

struct ParsedRequest {
  struct KeyValuePair keyValuePair;
  enum RequestType requestType;
};

enum RequestType getRequestTypeFromString(const char *typeStr) {
  if (strcasecmp(typeStr, "INSERT") == 0)
    return INSERT;
  else if (strcasecmp(typeStr, "GET") == 0)
    return GET;
  else if (strcasecmp(typeStr, "DELETE") == 0)
    return DELETE;
  else if (strcasecmp(typeStr, "EXIT") == 0)
    return EXIT;
  else
    return -1;
};

struct ParsedRequest parseRequest(char *request) {
  struct ParsedRequest result;
  char type[16];

  int matched = sscanf(request, "%15[^/]/%u/%u", type, &result.keyValuePair.key,
                       &result.keyValuePair.value);

  if (matched == 3) {
    result.requestType = getRequestTypeFromString(type);
  }

  return result;
}

int main(void) {
  keyValueStore = (struct KeyValueStore *)malloc(sizeof(struct KeyValueStore));
  initializeKeyValueStore(keyValueStore);
  struct ParsedRequest parsedRequest;
  char request[MESSAGE_SIZE]; // 16 bytes for 123456/1234/1234
  char response[72];          // SUCCEEDED or ERROR

  struct sockaddr_storage from;
  int err, newSock, sock;
  uint32_t adl;
  unsigned long i, f, n, num, sum;
  char cliIPtext[BUF_SIZE], cliPortText[BUF_SIZE];
  struct addrinfo req, *list;

  bzero((char *)&req, sizeof(req));
  // requesting an IPv4 type of communication
  req.ai_family = AF_INET6;
  req.ai_socktype = SOCK_STREAM;
  req.ai_flags = AI_PASSIVE; // local address
  err = getaddrinfo(NULL, SERVER_PORT, &req, &list);
  if (err) {
    printf("Failed to get local address, error: %s\n", gai_strerror(err));
    exit(1);
  }
  sock = socket(list->ai_family, list->ai_socktype, list->ai_protocol);
  if (sock == -1) {
    perror("Failed to open socket");
    freeaddrinfo(list);
    exit(1);
  }
  if (bind(sock, (struct sockaddr *)list->ai_addr, list->ai_addrlen) == -1) {
    perror("Bind failed");
    close(sock);
    freeaddrinfo(list);
    exit(1);
  }

  freeaddrinfo(list);
  listen(sock, SOMAXCONN);
  puts("Accepting TCP connections (IPv6/IPv4). Use CTRL+C to terminate the "
       "server");
  adl = sizeof(from);

  for (;;) {
    newSock = accept(sock, (struct sockaddr *)&from, &adl);
    if (!fork()) {
      close(sock);
      getnameinfo((struct sockaddr *)&from, adl, cliIPtext, BUF_SIZE,
                  cliPortText, BUF_SIZE, NI_NUMERICHOST | NI_NUMERICSERV);
      printf("New connection from %s, port number %s\n", cliIPtext,
             cliPortText);
      read(newSock, &request, MESSAGE_SIZE);

      parsedRequest = parseRequest(request);

      switch (parsedRequest.requestType) {
      case INSERT:
        printf("Insert\n");
        if (insert(keyValueStore, parsedRequest.keyValuePair.key,
                   parsedRequest.keyValuePair.value) > 0)
          printf("Inserted\n");
        else
          printf("Error on insert\n");

        // write(newSock, &request, 1);
        break;
      case GET:
        printf("Get\n");
        uint32_t value = get(keyValueStore, parsedRequest.keyValuePair.key);
        if (value > 0)
          printf("Get value:%d\n", value);
        else
          printf("Error on get\n");
        //  write(newSock, &request, 1);
        break;
      case DELETE:
        printf("Delete\n");
        int error = get(keyValueStore, parsedRequest.keyValuePair.key);
        if (error > 0)
          printf("Deleted\n");
        else
          printf("Error on delte\n");
        // write(newSock, &request, 1);
        break;
      case EXIT:
        printf("Exit Received\n");
        printf("Connection %s, port number %s closed %ld\n", cliIPtext,
               cliPortText, sum);
        close(newSock);
        break;
      }
      exit(0);
    }
  }

  close(sock);
  return 0;
}
