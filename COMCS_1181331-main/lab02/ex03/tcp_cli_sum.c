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
#define BUF_SIZE 30
#define SERVER_PORT "9999"
#define MESSAGE_SIZE 128
// read a string from stdin protecting buffer overflow
#define GETS(B, S)                                                             \
  {                                                                            \
    fgets(B, S - 2, stdin);                                                    \
    B[strlen(B) - 1] = 0;                                                      \
  }
int main(int argc, char **argv) {
  int err, sock;
  unsigned long f, i, n, num;
  unsigned char bt;
  char line[BUF_SIZE];
  struct addrinfo req, *list;
  if (argc != 2) {
    puts("Server's IPv4/IPv6 address or DNS name is required as argument");
    exit(1);
  }
  bzero((char *)&req, sizeof(req)); // let getaddrinfo set the family depending
                                    // on the supplied server address
  req.ai_family = AF_UNSPEC;
  req.ai_socktype = SOCK_STREAM;
  err = getaddrinfo(argv[1], SERVER_PORT, &req, &list);
  if (err) {
    printf("Failed to get server address, error: %s\n", gai_strerror(err));
    exit(1);
  }
  sock = socket(list->ai_family, list->ai_socktype, list->ai_protocol);
  if (sock == -1) {
    perror("Failed to open socket");
    freeaddrinfo(list);
    exit(1);
  }
  if (connect(sock, (struct sockaddr *)list->ai_addr, list->ai_addrlen) == -1) {
    perror("Failed connect");
    freeaddrinfo(list);
    close(sock);
    exit(1);
  }
  for (;;) {
    GETS(line, BUF_SIZE);
    char command[16];
    unsigned int arg1, arg2;

    while (sscanf(line, "%15[^/]/%u/%u", command, &arg1, &arg2) != 3) {
      puts("Invalid request, must be {COMMAND/KEY/VALUE}");
      GETS(line, BUF_SIZE);
    }

    write(sock, &line, MESSAGE_SIZE);

    // read(sock, &bt, 1);
  }
  close(sock);
  exit(0);
}
