all: client server 

client: simple_udp_cli.c
	gcc -o client simple_udp_cli.c

server: simple_udp_srv.c
	gcc -o server simple_udp_srv.c

clean:
	rm client server
