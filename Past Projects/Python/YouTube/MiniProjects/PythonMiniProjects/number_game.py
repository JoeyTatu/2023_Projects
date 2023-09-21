import random

top_of_range = input("Type a number: ")
guesses = 0

if top_of_range.isdigit():
    top_of_range = int(top_of_range)

    if top_of_range <= 0:
        print("Please type a number larger than 0")
        quit()
else:
    print("Please insert a number.")
    quit()

random_number = random.randint(0, top_of_range)

while True:
    guesses += 1
    user_guess = input("Make a guess: ")

    if user_guess.isdigit():
        user_guess = int(user_guess)

    else:
        print("Please insert a number.")
        continue

    if user_guess == random_number:
        print("Yay! You got it!")
        print("It took", guesses, "guesses")
        break

    elif user_guess > random_number:
        print("Your guess is ABOVE the random number")
        
    else:
        print("Your guess is BELOW the random number")
        