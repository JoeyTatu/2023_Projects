package main

import (
	"database/sql"
	"fmt"
	"log"

	_ "github.com/lib/pq"
)

type Storage interface {
	CreateAccount(*Account) error
	DeleteAccount(int) error
	UpdateAccount(*Account) error
	GetAccounts() ([]*Account, error)
	GetAccountById(int) (*Account, error)
}

type PostgresStore struct {
	db *sql.DB
}

func NewPostgresStore() (*PostgresStore, error) {
	connStr := "user=postgres dbname=postgres password=postgres sslmode=disable"
	db, err := sql.Open("postgres", connStr)

	if err != nil {
		return nil, err
	}

	if err := db.Ping(); err != nil {
		return nil, err
	}

	return &PostgresStore{
		db: db,
	}, nil
}

func (s *PostgresStore) init() error {
	return s.createAccountTable()
}

func (s *PostgresStore) createAccountTable() error {
	query := `CREATE TABLE IF NOT EXISTS account (
		id SERIAL PRIMARY KEY,
		first_name VARCHAR(50),
		last_name VARCHAR(50),
		number SERIAL,
		balance FLOAT,
		created_at TIMESTAMP
	);`

	// Execute the SQL query
	_, err := s.db.Exec(query)
	if err != nil {
		log.Fatal(err)
	}

	// fmt.Println("Table 'account' created successfully.")

	return err
}

func (s *PostgresStore) CreateAccount(acc *Account) error {

	query := "INSERT INTO Account (first_name, last_name, number, balance, created_at) VALUES ($1, $2, $3, $4, $5)"

	response, err := s.db.Exec(
		query,
		acc.FirstName,
		acc.LastName,
		acc.Number,
		acc.Balance,
		acc.CreatedAt,
	)

	if err != nil {
		return err
	}
	fmt.Printf("%+v\n", response)

	return nil
}

func (s *PostgresStore) DeleteAccount(id int) error {
	_, err := s.db.Query("DELETE FROM account WHERE ID = $1", id)
	return err
}

func (s *PostgresStore) UpdateAccount(*Account) error {
	return nil
}

func (s *PostgresStore) GetAccountById(id int) (*Account, error) {
	rows, err := s.db.Query("SELECT * FROM account WHERE id = $1", id)
	if err != nil {
		return nil, err
	}
	
	for rows.Next() {
		return scanIntoAccount(rows)
	}

	return nil, fmt.Errorf("account with id %d not found", id)
}

func (s *PostgresStore) GetAccounts() ([]*Account, error) {
	rows, err := s.db.Query("SELECT * FROM account")
	if err != nil {
		return nil, err
	}

	accounts := []*Account{}
	for rows.Next() {
		account, err := scanIntoAccount(rows)
		if err != nil {
			return nil, err
		}
		accounts = append(accounts, account)
	}

	return accounts, nil
}

func scanIntoAccount(rows *sql.Rows) (*Account, error) {
	account := new(Account)
	err := rows.Scan(
		&account.ID,
		&account.FirstName,
		&account.LastName,
		&account.Number,
		&account.Balance,
		&account.CreatedAt,
	)

	return account, err
}
