package main

import (
	"flag"
	"fmt"
	"gotemp/api"
	"gotemp/storage"
	"log"
)

func main() {
	listenAddr := flag.String("listenaddr", ":3000", "Server address")
	flag.Parse()

	store := storage.NewMemoryStorage()

	server := api.NewServer(*listenAddr, store)
	fmt.Println("Server running on port", *listenAddr)
	log.Fatal(server.Start())
}

// https://www.youtube.com/watch?v=EqniGcAijDI
// 13:30