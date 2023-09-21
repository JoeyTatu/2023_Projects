package atmproject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cardNumber;
        int atmPin;
        int enteredCardNumber;
        int enteredPinNumber;
        int choice;
        double depositValue;
        double withdrawValue;
        Scanner in;
        ATMOperationInterface operation = new ATMOperationImpl();

        cardNumber = 12345;
        atmPin = 1234;

        System.out.println("WELCOME TO YOUR LOCAL BANK ATM");
        in = new Scanner(System.in);
        System.out.println("Enter Card number: ");
        enteredCardNumber = in.nextInt();
        System.out.println("Enter PIN: ");
        enteredPinNumber = in.nextInt();

        if ((enteredCardNumber == cardNumber) && (enteredPinNumber == atmPin)) {
            while (true) {
                System.out.println("""
                        1. View Balance
                        2. Withdraw
                        3. Deposit
                        4. View mini statement
                        5. EXIT
                        Please enter choice:""");
                choice = in.nextInt();
                switch (choice) {
                    case 1:
                        operation.viewBalance();
                        break;
                    case 2:
                        System.out.println("Enter amount to withdraw:");
                        withdrawValue = in.nextDouble();
                        operation.withdrawAmount(withdrawValue);
                        break;
                    case 3:
                        System.out.println("Enter amount to deposit:");
                        depositValue = in.nextDouble();
                        operation.depositAmount(depositValue);
                        break;
                    case 4:

                        break;
                    case 5:
                        System.out.println("Please take your card");
                        System.exit(0);
                    default:
                        System.out.println("Please enter correct choice");
                }
            }
        } else {
            System.out.println("Incorrect PIN!");
            System.exit(0);
        }
    }
}
