package eazy.algo;

import java.util.Formatter;

public class Pizza {
    Formatter f = new Formatter();
    private double price;
    private final Boolean veg;
    private final double extraCheesePrice = 1.0;
    private final double extraToppingsPrice = 1.5;
    private final double includeBagPrice = 0.25;

    public Pizza(Boolean veg) {
        this.veg = veg;
        if (this.veg) {
            this.price = 3.00;
        } else {
            this.price = 4.00;
        }
    }

    public void getPizzaPrice() {
        f.format("%.2f", this.price);
        System.out.println(f.toString());
    }

    public void addExtraCheese() {
        System.out.println("Extra cheese added");
        this.price += extraCheesePrice;
    }

    public void addExtraToppings() {
        System.out.println("Extra toppings added");
        this.price += extraToppingsPrice;
    }

    public void takeAway() {
        System.out.println("Take away selected");
        this.price += includeBagPrice;
    }

    public void getBill() {
        f.format("%.2f", this.price);
        System.out.println("Total: €" + f.toString());
    }
}
