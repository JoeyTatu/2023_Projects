package vechicle.app;

public class Vehicle {
    private String name;
    private int currentSpeed, currentDirection;

    public Vehicle(String name) {
        this.name = name;
        this.currentSpeed = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        String cardinalDirection = convertToCardinal(direction);
        System.out.println("Steer method called. Steering at: " + cardinalDirection);
    }

    public void move(int speed, int direction) {
        currentSpeed = speed;
        currentDirection = direction;
        String cardinalDirection = convertToCardinal(direction);
        System.out.println("Move method called. Moving at: " + currentSpeed + "km/h in the direction of " + cardinalDirection);
    }

    public static String convertToCardinal(double degrees) {
        String[] cardinalDirections = {"North", "North-Northeast", "Northeast", "East-Northeast", "East", "East-Southeast", "Southeast", "South-Southeast", "South", "South-Southwest", "Southwest", "West-Southwest", "West", "West-Northwest", "Northwest", "North-Northwest"};

        int index = (int) Math.round(degrees / 22.5) % 16;
        return cardinalDirections[index];
    }

    public void stop() {
        this.currentSpeed = 0;
        System.out.println("Vehicle has stopped.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
