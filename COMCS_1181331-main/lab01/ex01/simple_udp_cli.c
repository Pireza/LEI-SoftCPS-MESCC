// Client side implementation of UDP client-server model
#include <arpa/inet.h>
#include <netdb.h>
#include <netinet/in.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <sys/socket.h>
#include <sys/types.h>
#include <unistd.h>

#define PORT "8080"
#define MAXLINE 1024
#define MSG_CONFIRM 0 // MACOS specific

// Driver code
int main(int argc, char **argv) {
  if (argc != 2) {
    printf("usage: %s <ip address>\n", argv[0]);
    exit(0);
  }
  int sockfd;
  char buffer[MAXLINE];
  char *hello = "Hello Server";

  // Creating socket file descriptor
  // SOCK_DGRAM indicates the type of socket to be created which in this case
  // is a UDP
  if ((sockfd = socket(AF_INET, SOCK_DGRAM, 0)) < 0) {
    printf("socket creation failed");
    exit(EXIT_FAILURE);
  }

  // Resolve hostname using getaddrinfo()
  struct addrinfo hints, *res;

  memset(&hints, 0, sizeof(hints));
  hints.ai_family = AF_INET; // IPv4
  // hints.ai_family = AF_INET6;     // IPv6
  hints.ai_socktype = SOCK_DGRAM; // UDP socket

  if (getaddrinfo(argv[1], PORT, &hints, &res)) {
    perror("getaddrinfo error");
    exit(EXIT_FAILURE);
  }

  int n;
  sendto(sockfd, (const char *)hello, strlen(hello), MSG_CONFIRM, res->ai_addr,
         res->ai_addrlen);
  printf("Hello message sent.\n");

  n = recvfrom(sockfd, (char *)buffer, MAXLINE, MSG_WAITALL, res->ai_addr,
               &res->ai_addrlen);
  buffer[n] = '\0'; // adds a “\0” character to terminate the received string
  printf("Server : %s\n", buffer);

  freeaddrinfo(res);
  close(sockfd);
  return 0;
}
