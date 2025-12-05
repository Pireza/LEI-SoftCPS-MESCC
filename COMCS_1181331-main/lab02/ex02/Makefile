all: client server 

client: stcp_cli_sum.c
		gcc -o client stcp_cli_sum.c

server: simple_tcp_srv.c
		gcc -o server simple_tcp_srv.c

clean:
		rm client server

