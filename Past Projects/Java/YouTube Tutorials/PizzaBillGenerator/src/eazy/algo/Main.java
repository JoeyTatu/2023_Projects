package eazy.algo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean veg = false;

        System.out.println("Is this pizza veg only? (yes/no)");
        if (scanner.nextLine().equals("yes")) {
            veg = true;
        } else if (scanner.nextLine().equals("no")) {
            veg = false;
        } else {
            System.out.println("Invalid response. Please try again");
            System.exit(0);
        }

        Pizza base = new Pizza(veg);

        System.out.println("Would you like extra cheese? (yes/no)");
        if (scanner.nextLine().equals("yes")) {
            base.addExtraCheese();
        } else if (scanner.nextLine().equals("no")) {

        } else {
            System.out.println("Invalid response. Please try again");
            System.exit(0);
        }

        System.out.println("Are you dining in or takeaway? (dining/takeaway)");
        if (scanner.nextLine().equals("takeaway")) {
            base.takeAway();
        } else if (scanner.nextLine().equals("dining")) {

        } else {
            System.out.println("Invalid response. Please try again");
            System.exit(0);
        }

        base.getBill();
    }
}
