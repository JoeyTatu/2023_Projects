package project.restaurant;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static Scanner input = new Scanner(System.in);
    public static int choice, qtyOfItem;
    public static double priceOfItem, subtotal;
    public static Boolean checkChoice;
    public static ArrayList<String> items = new ArrayList<>();
    public static ArrayList<Double> priceList = new ArrayList<>();
    public static ArrayList<ArrayList<Double>> qtyAndPrice = new ArrayList<>();



    public static void main(String[] args) {
        Collections.addAll(items,
                "Hamburger",
                "Hot Dog",
                "Battered Cod",
                "French Fries",
                "Coffee",
                "Tea",
                "Soft Drink",
                "Water");

        Collections.addAll(priceList,
                4.5,
                4.0,
                7.5,
                3.0,
                2.5,
                2.0,
                1.2,
                0.8);

        menu();
        order();
    }


    private static void menu() {
        System.out.println("""
                -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                                
                    WELCOME TO THE RESTAURANT
                                
                    == Restaurant Menu ==
                    \t\t\t\t  €
                    1. Hamburger \t 4.50
                    2. Hot Dog \t\t 4.00
                    3. Battered Cod\t 7.50
                    4. French Fries\t 3.00
                    5. Coffee \t\t 2.50
                    6. Tea \t\t\t 2.00
                    7. Soft Drink\t 1.20
                    8. Water \t\t 0.80
                    
                    9. COMPLETE ORDER
                    10. CANCEL
                    
                    Note: Prices include VAT @ 23%.
                                
                -_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-
                """);
    }


    private static void order() {
        System.out.println("Please select a menu item (1-9).");
        choice = input.nextInt();

        checkChoice = checkChoice();
        if (checkChoice) {
            System.out.println("How many " + items.get(choice - 1) + " would you like?");

            qtyOfItem = input.nextInt();
            priceOfItem = priceList.get(choice - 1);

            double priceAndQty = qtyOfItem * priceOfItem;

//            System.out.println(priceAndQty);

            subtotal += priceAndQty;
        }


//        if (choice == 1) {
//            item = "hamburger";
//            itemPrice = 4.5;
//
//        } else if (choice == 2) {
//            item = "dot dog";
//            itemPrice = 4.0;
//
//        } else if (choice == 3) {
//            item = "battered cod";
//            itemPrice = 7.5;
//
//        } else if (choice == 4) {
//            item = "French fries";
//            itemPrice = 3.0;
//
//        } else if (choice == 5) {
//            item = "Coffee";
//            itemPrice = 2.5;
//
//        } else if (choice == 6) {
//            item = "tea";
//
//        } else if (choice == 7) {
//            item = "soft drink";
//
//        } else if (choice == 8) {
//
//            item = "water";
//        }
//
//        if (choice == 4) {
//            System.out.println("How many " + item + "?");
//        } else {
//            System.out.println("How many " + item + "s?");
//        }
//        qty = input.nextInt();
//
//        switch (choice) {
//            case 1 -> itemPrice = 4.5;
//            case 2 -> itemPrice = 4.0;
//            case 3 -> itemPrice = 7.5;
//            case 4 -> itemPrice = 3.0;
//            case 5 -> itemPrice = 2.5;
//            case 6 -> itemPrice = 2.0;
//            case 7 -> itemPrice = 1.2;
//            case 8 -> itemPrice = 0.8;
    }

    private static boolean checkChoice() {
        if ((choice < 1) || (choice > 10)) {
            System.out.println("Choice not available. Try again.");
            return false;
        } else if (choice == 10) {
            System.out.println("Order cancelled!");
            return false;
        } else if (choice == 9) {
            if (qtyAndPrice.isEmpty()) {
                System.out.println("No items in basket");
                return false;
            }
        }
        return true;
    }
}

