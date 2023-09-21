package vechicle.app;

public class Car extends Vehicle {
    private int wheels, doors, gears, currentGear;
    private String type, cardinalDirection;
    private Boolean isManual;

    public Car(String name, int wheels, int doors, int gears, String type, Boolean isManual) {
        super(name);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.type = type;
        this.isManual = isManual;
        currentGear = 1;
    }

    public void changeGear(int newGear) {
        this.currentGear = newGear;
        System.out.println("changeGear method called");
        switch (this.currentGear) {
            case -1 -> System.out.println("Changed to REVERSE gear");
            case 0 -> System.out.println("Changed to NEUTRAL gear");
            case 1 -> System.out.println("Changed to " + this.currentGear + "st gear");
            case 2 -> System.out.println("Changed to " + this.currentGear + "nd gear");
            case 3 -> System.out.println("Changed to " + this.currentGear + "rd gear");
            default -> System.out.println("Changed to " + this.currentGear + "th gear");
        }
    }

    public void changeSpeed(int newSpeed, int newDirection) {
        move(newSpeed, newDirection);
        cardinalDirection = convertToCardinal(newDirection);
        System.out.println("changeSpeed method called. Speed: " + newSpeed + "km/h. Direction: " + cardinalDirection);
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCardinalDirection() {
        return cardinalDirection;
    }

    public void setCardinalDirection(String cardinalDirection) {
        this.cardinalDirection = cardinalDirection;
    }

    public Boolean getManual() {
        return isManual;
    }

    public void setManual(Boolean manual) {
        isManual = manual;
    }
}
