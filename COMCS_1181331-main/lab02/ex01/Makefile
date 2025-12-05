all: client server 

client: simple_tcp_cli.c
		gcc -o client simple_tcp_cli.c

server: simple_tcp_srv.c
		gcc -o server simple_tcp_srv.c

clean:
		rm client server

