package storage

import "gotemp/types"

type Storage interface {
	Get(int) *types.User
}