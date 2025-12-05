all: client server 

client: tcp_cli_sum.c
		gcc -o client tcp_cli_sum.c

server: tcp_srv_sum.c
		gcc -o server tcp_srv_sum.c

clean:
		rm client server

