package storage

import "gotemp/types"

type MongoStorage struct{}

func (s *MongoStorage) Get(id int) *types.User {
	return &types.User{
		Id:   1,
		Name: "Foo",
	}
}
