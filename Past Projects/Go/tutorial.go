package main

// func main() {
// 	var number uint64
// 	var bl bool
// 	fmt.Println(number, bl)
// }

// func main() {
// 	// var scanner *bufio.Scanner = bufio.NewScanner(os.Stdin)
// 	scanner := bufio.NewScanner(os.Stdin)
// 	fmt.Printf("Type year of birth: ")
// 	scanner.Scan()
// 	input, _ := strconv.ParseInt(scanner.Text(), 10, 64)
// 	fmt.Printf("You will be %d years old at the end of 2023", 2023-input)
// }

// func main() {
// 	var num1 int = 4
// 	var num2 int = 1
// 	answer := num1 % num2
// 	fmt.Printf("%d", answer)
// }

import (
	"fmt"
)

func main() {
	// x := 'c'
	// y := 'd'
	// val := x < y
	// fmt.Printf("%t", val)

	val := true || false
	fmt.Printf("%t", val)
}
