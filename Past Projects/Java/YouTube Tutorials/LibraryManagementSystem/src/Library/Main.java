package Library;

import java.util.Scanner;

public class Main {

    public static Scanner scanner;
    public static Database db;

    public static void main(String[] args) {
        System.out.println("Welcome to the Library Management System");
        db = new Database();

        System.out.println("""
                Welcome to the Library Management System
                0. EXIT
                1. Login
                2. New User
                """);

        scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 0:
                System.out.println("Exiting...");
                System.exit(0);
            case 1:
                login();
            case 2:
                newUser();
        }
    }

    private static void login() {
        System.out.println("Enter phone number");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter email address:");
        String email = scanner.nextLine();

        int index = db.login(phoneNumber, email);
        if (index != -1) {
            User user = db.getUser(index);
            user.menu(db, user);
        } else {
            System.out.println("User does not exist.");
        }
    }

    private static void newUser() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter last name: ");
        String lastName = sc.nextLine();

        String name = firstName + " " + lastName;

        System.out.println("Enter phone number");
        String phoneNumber = sc.nextLine();

        System.out.println("Enter email address:");
        String email = sc.nextLine();

        System.out.println("""
                1. Admin
                2. Restricted User
                Enter type of account:""");
        int accountType = sc.nextInt();

        User user = null;
        if (accountType == 1) {
            user = new Admin(name, email, phoneNumber);
            db.AddUser(user);
        } else if (accountType == 2) {
            user = new RestrictedUser(name, email, phoneNumber);
            db.AddUser(user);
        }
        db.AddUser(user);
        user.menu(db, user);
    }
    //8:08 https://www.youtube.com/watch?v=U3X4x1TYHIk&t=8m8s
}
