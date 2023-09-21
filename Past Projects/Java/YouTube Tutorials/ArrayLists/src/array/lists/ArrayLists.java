package array.lists;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLists {
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<Integer>();
//
////        ArrayList<String> list2 = new ArrayList<String>();
////        ArrayList<Boolean> list3 = new ArrayList<Boolean>();
//        list.add(0);
//        list.add(2);
//        list.add(3);
//
//        System.out.println(list);
//
//        int element = list.get(0);
//        System.out.println(element);
//
//        list.add(1, 1);
//        System.out.println(list);
//
//        Collections.sort(list);

        ArrayList<ArrayList<Double>> totals = new ArrayList<>();
        ArrayList<Double> totalPrice = new ArrayList<>();
        double subtotal = 0;
        double taxToPay = 0;
        double totalToPay = 0;
        double amountTendered = 0;
        double change = 0;
        final double TAX_RATE = 0.23;
        String paymentType;
        Scanner scanner = new Scanner(System.in);


        ArrayList<String> items = new ArrayList<>();
        items.add("Pasta");
        items.add("Garlic Bread");
        items.add("Doughnuts");
//        System.out.println(items);

        ArrayList<Double> qty = new ArrayList<>();
        qty.add(1.0);
        qty.add(3.0);
        qty.add(6.0);
//        System.out.println(qty);

        ArrayList<Double> price = new ArrayList<>();
        price.add(4.2);
        price.add(5.2);
        price.add(3.4);

        totals.add(qty);
        totals.add(price);

        System.out.println("QTY\tITEM\tPRICE EACH");

        for (int i = 0; i < qty.toArray().length; i++) {
            System.out.println(qty.get(i) + "\t" + items.get(i) + "\t" + price.get(i));
            totalPrice.add(qty.get(i) * price.get(i));

        }

        for (int i = 0; i < qty.toArray().length; i++) {
            subtotal += totalPrice.get(i);
        }

        taxToPay = subtotal * TAX_RATE;
        totalToPay = subtotal + taxToPay;

        System.out.println("\nSUBTOTAL: €" + (double) Math.round(subtotal * 100.0) / 100.0);
        System.out.println("VAT @" + (int) (TAX_RATE * 100.0) + "%: €" + (double) Math.round(taxToPay * 100.0) / 100.0);
        System.out.println("TOTAL TO PAY: €" + (double) Math.round(totalToPay * 100.0) / 100.0);

        System.out.println("\nPayment type:");
        paymentType = scanner.nextLine();

        System.out.println("\nAmount tendered:");
        amountTendered = scanner.nextDouble();

        while (amountTendered < totalToPay) {
            amountTendered = 0.0;
            System.out.println("\nAmount tendered must be more than total to pay");
            System.out.println("Total to pay: €" + (double) Math.round(totalToPay * 100.0) / 100.0);
            System.out.println("Amount tendered:");
            amountTendered = scanner.nextDouble();
        }

        change = amountTendered - totalToPay;

        System.out.println("\nCHANGE: €" + (double) Math.round(change * 100.0) / 100.0);


    }
}
