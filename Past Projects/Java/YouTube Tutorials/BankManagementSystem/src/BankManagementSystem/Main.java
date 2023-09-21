package BankManagementSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int lastAccountId = 0;
    private static ArrayList<Account> accounts;

    public static void main(String[] args) {
        accounts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int input = 0;
        do {
            System.out.println("""
                    Welcome to the Bank Management System
                    1. Create new account
                    2. Login
                    3. Exit""");
            input = scanner.nextInt();
            switch (input) {
                case 1:
                    createNewAccount();
                    break;
                case 2:
                    login();
                    break;
            }
        } while (input != 3);
    }

    private static void createNewAccount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter balance:");
        double balance = scanner.nextDouble();

        System.out.println("Enter passcode:");
        int passcode = scanner.nextInt();

        System.out.println("Confirm passcode:");
        int passcodeConfirm = scanner.nextInt();

        if (passcode != passcodeConfirm) {
            System.out.println("Passcodes do not match!");
        }

        int accountId = 1000000 + lastAccountId;
        lastAccountId = lastAccountId + 1;

        Account account = new Account(firstName, lastName, accountId, balance, passcode);
        accounts.add(account);

        System.out.println("Your account ID is: " + accountId);

        showMenu(account);
    }

    private static void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account ID:");
        int accountID = scanner.nextInt();

        System.out.println("Enter passcode:");
        int passcode = scanner.nextInt();

        Account account = null;
        boolean accountExists = false;

        for (Account acc : accounts) {
            if (acc.getAccountId() == accountID && acc.getPasscode() == passcode) {
                accountExists = true;
                account = acc;
                break; // Exit the loop once the account is found
            }
        }

        if (accountExists) {
            showMenu(account);
        } else {
            System.out.println("Account does not exist\n");
        }
    }

    public static void showMenu(Account account) {
        System.out.println("Welcome " + account.getFirstName() + " " + account.getLastName() + "!");
    }

} // https://www.youtube.com/watch?v=RKc8XZ_uilE