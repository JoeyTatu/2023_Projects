package types

type User struct {
	Id		int `json:"ID"`
	Name string `json:name`
}

func ValidateUser(u *User) bool { return true }