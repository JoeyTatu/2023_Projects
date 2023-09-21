people = {"dave": "joiner", "bob": "builder"}


def update_dictionary():
    for i in range(3):
        name = input("Please input new name: (Q to quit)").lower()
        if name == "q":
            print(people)
            print("Database updated!")
            break
        else:
            job = input("Please input job: ").lower()
            people[name] = job
            print(people)


def database():
    while True:
        option = input(
            """Please make a selection:
            1 -> Clear
            2 -> Update 
            3 -> View
            4 -> Quit
            """
        )

        if option.isdigit():
            option = int(option)
            if option >= 1 and option <= 3:
                break
            else:
                print("Goodbye!")
                quit()
        else:
            print("Please enter numbers only!")

    if option == 1:
        people.clear()
        print(people)
        print("Database cleared!")

    elif option == 2:
        update_dictionary()

    elif option == 3:
        print(people)

    else:
        print("Goodbye!")
        quit()


def enter_password():
    password = "123abc"
    user_input = input("Enter password: ")
    if len(user_input) < 3 and user_input != password:
        print("Access denied")
        quit()
    else:
        print("Access granted")
        database()


def intro():
    print("Welcome to the Database\n")
    # print("To get access, enter password: ")
    enter_password()


intro()
