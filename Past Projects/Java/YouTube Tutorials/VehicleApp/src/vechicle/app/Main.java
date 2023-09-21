package vechicle.app;

public class Main {
    public static void main(String[] args) {
        SUV suv = new SUV("Fortuner", false);
        suv.move(41, 0);
        suv.accelerate(20);
//        suv.accelerate(-61);
        System.out.println("Gear: " + suv.getCurrentGear());
        System.out.println("Speed: " + suv.getCurrentSpeed() + "km/h");
    }
}
