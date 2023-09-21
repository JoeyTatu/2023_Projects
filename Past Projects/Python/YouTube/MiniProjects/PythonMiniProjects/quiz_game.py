print("Welcome to my computer quiz!")
score = 0

playing = input("Do you want to play? ").lower()

if playing != "yes":
    quit()

print("OK! Let's play!")

answer = input("What does CPU stand for? ").lower()
if answer == "central processing unit":
    print("Correct")
    score += 1
else: 
    print("Incorrect! CPU stands for Central Processing Unit. Your answer was: " + answer)

print("Current score: " + str(score) + "/4")

answer = input("What does GPU stand for? ").lower()
if answer == "graphics processing unit":
    print("Correct")
    score += 1
else: 
    print("Incorrect! GPU stands for Graphics Processing Unit. Your answer was: " + answer)

print("Current score: " + str(score) + "/4")

answer = input("What does RAM stand for? ").lower()
if answer == "random access memory":
    print("Correct")
    score += 1
else: 
    print("Incorrect! RAM stands for Random Access Memory. Your answer was: " + answer)

print("Current score: " + str(score) + "/4")

answer = input("What does PSU stand for? ").lower()
if answer == "power supply":
    print("Correct")
    score += 1
else: 
    print("Incorrect! PSU stands for Power Supply. Your answer was: " + answer)

print("Final score: " + str(score) + "/4 or " + str(int((score / 4) * 100)) + "%")
