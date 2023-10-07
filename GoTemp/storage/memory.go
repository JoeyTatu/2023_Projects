package storage

import "gotemp/types"

type MemoryStorage struct{}

func NewMemoryStorage() *MemoryStorage {
	return &MemoryStorage{}
}

func (s *MemoryStorage) Get(id int) *types.User {
	return &types.User{
		Id:   1,
		Name: "Foo",
	}
}
