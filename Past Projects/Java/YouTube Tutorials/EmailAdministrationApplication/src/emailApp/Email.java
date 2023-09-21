package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String alternativeEmail;
    private String emailAddress;
    private String companySuffix = ".company.com";
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 10;
    Scanner scanner;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);

        this.department = setDepartment();
        this.password = randomPassword(defaultPasswordLength);

        if (department.equals("")) {
            emailAddress = firstName.toLowerCase() + "." +
                    lastName.toLowerCase() + "@staff" +
                    companySuffix;
        } else {
            emailAddress = firstName.toLowerCase() + "." +
                    lastName.toLowerCase() + "@" +
                    department.toLowerCase() +
                    companySuffix;
        }
        System.out.println("\nEMAIL CREATED" +
                "\nName: " + this.lastName + ", " + this.firstName +
                "\nDepartment: " + this.department +
                "\nPassword: " + this.password +
                "\nEmail address: " + emailAddress
        );
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFHIJKLMOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) ((Math.random()) * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

    private String setDepartment() {
        scanner = new Scanner(System.in);
        System.out.print("1 for Sales\n2 for Development\n3 for Accounting\n4 for None\nENTER DEPARTMENT: ");
        int depChoice = scanner.nextInt();

        return switch (depChoice) {
            case 1 -> "Sales";
            case 2 -> "Development";
            case 3 -> "Accounting";
            default -> "";
        };
    }

    public void setMailboxCapacity() {
        scanner = new Scanner(System.in);
        System.out.println("Please enter the mailbox capacity:");
        this.mailboxCapacity = scanner.nextInt();
    }

    public void setAlternativeEmail() {
        scanner = new Scanner(System.in);
        System.out.println("Please enter your alternative email:");
        this.alternativeEmail = scanner.nextLine();
    }

    public void changePassword() {
        scanner = new Scanner(System.in);
        System.out.println("Please enter your new password:");
        this.password = scanner.nextLine();
    }



    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternativeEmail() {
        return alternativeEmail;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "firstName= " + firstName + '\n' +
                "lastName= " + lastName + '\n' +
                "password= " + password + '\n' +
                "department= " + department + '\n' +
                "alternativeEmail= " + alternativeEmail + '\n' +
                "emailAddress= " + emailAddress + '\n' +
                "mailboxCapacity= " + mailboxCapacity;
    }
}
