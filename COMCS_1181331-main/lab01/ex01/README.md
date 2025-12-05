###2.1.3
Multiple IPs can be on a given server, and different sockets on the same port on different IPs, so we use the destination IP to know where the datagram should be sent to.
##Solution
Added the following to the client:
Now with broadcast enabled (and the server is listening to all avaiable network interfaces), we put the argument for the broadcast ip.
  int broadcastEnable = 1;
  // broadcast permission to 1
  if (setsockopt(sockfd, SOL_SOCKET, SO_BROADCAST, &broadcastEnable,
                 sizeof(broadcastEnable)) < 0) {
    perror("socket creation failed");
    exit(EXIT_FAILURE);
  }

