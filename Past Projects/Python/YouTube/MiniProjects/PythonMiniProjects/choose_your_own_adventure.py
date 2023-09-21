name = input("Type your name: ")
print("Welcome", name, "to this adventure!")

answer = input(
    "You are on a dirt road, it has come to and end. You can go left or right, which way would you like to go? "
).lower()

if answer == "left":
    answer = input(
        "You come to a river. You can walk around it or swim across. Type walk or swim: "
    )
    if answer == "walk":
        print(
            "You walked for many kilometres trying to find a bridge or something to cross over. You don't find one. Your water runs out. You slip off the edge of the river and fall in. As you do, your head hits off a large stone and kills you. You're dead."
        )

    elif answer == "swim":
        print(
            "You try to swim across but an alligator bites and kills you. You're dead."
        )

    else:
        print(
            "Not a valid option. A wolf sees you and chases you. The wolf catches you, pins you down and tears you to shreds. You are dead."
        )


elif answer == "right":
    answer = input(
        "You come to a river. You can walk around it or swim across. Type walk or swim: "
    )
    if answer == "walk":
        print(
            "You walked for many kilometres trying to find a bridge or something to cross over. You don't find one. Your water runs out. You slip off the edge of the river and fall in. As you do, your head hits off a large stone and kills you. You're dead."
        )

    elif answer == "swim":
        print(
            "You try to swim across but an alligator bites and kills you. You're dead."
        )

    else:
        print(
            "Not a valid option. A wolf sees you and chases you. The wolf catches you, pins you down and tears you to shreds. You are dead."
        )

else:
    print("Not a valid option. You die from procrastination")
