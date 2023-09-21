from cryptography.fernet import Fernet
import os

pass_code = input("Please enter your pass code: ")


def view():
    if not os.path.exists(pass_code + "_passwords.txt"):
        print("No passwords saved!") # File not found.
    else:
        with open(pass_code + "_passwords.txt", "r") as f:
            if os.stat(pass_code + ".key").st_size == 0:
                print("No passwords saved.")
            else:
                try:
                    for line in f.readlines():
                        data = line.rstrip()
                        user, passw = data.split("|")
                        print(
                            "User:",
                            user,
                            "| Password:",
                            fernet.decrypt(passw.encode()).decode(),
                        )
                except Exception as ex:
                    print("An error occurred: " + type(ex).__name__)


def add():
    name = input("Account Name: ")
    pwd = input("Password: ")
    with open(pass_code + "_passwords.txt", "a") as f:
        f.write(name + "|" + fernet.encrypt(pwd.encode()).decode() + "\n")


def write_key():
    key = Fernet.generate_key()
    with open(pass_code + ".key", "wb") as key_file:
        # 'wb' = write byte
        key_file.write(key)


def load_key():
    with open(pass_code + ".key", "rb") as file:
        # 'rb' = read bytes
        key = file.read()
    return key


if not os.path.exists(pass_code + ".key"):
    write_key()

key = load_key()
fernet = Fernet(key)

# While loop
while True:
    mode = input("Pick a number:\n1. Add a new password\n2. View passwords\n3. Quit\n")

    mode = int(mode)

    if mode == 1:  # Add a new Password
        add()

    elif mode == 2:  # View Passwords
        view()

    elif mode == 3:
        print("Quitting...")
        break

    else:
        print("Invalid selection. Please try again.")
        continue
