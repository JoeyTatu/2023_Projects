package vechicle.app;

public class SUV extends Car {

    public SUV(String name, Boolean isManual) {
        super(name, 4, 5, 6, "SUV", isManual);
    }

    public void accelerate(int rate) {
        int newSpeed = getCurrentSpeed() + rate;

        // speed -10- 1  : gear -1 // Reverse
        // speed 0       : gear 0 // Neutral
        // speed 1 - 10  : gear 1
        // speed 11 - 20 : gear 2
        // speed 21 - 30 : gear 3
        // speed 31 - 40 : gear 4
        // speed 41 - 50 : gear 5
        // speed 51+     : gear 6

        if (newSpeed == 0) {
            stop();
            changeGear(0);
        } else if (newSpeed > 0 && newSpeed <= 15) {
            changeGear(1);
        } else if (newSpeed > 15 && newSpeed <= 30) {
            changeGear(2);
        } else if (newSpeed > 30 && newSpeed <= 50) {
            changeGear(3);
        } else if (newSpeed > 50 && newSpeed <= 60) {
            changeGear(4);
        } else if (newSpeed > 60 && newSpeed <= 80) {
            changeGear(5);
        } else if (newSpeed > 80) {
            changeGear(6);
        } else if (newSpeed >= -20 && newSpeed < 0) {
            changeGear(-1);
        }

        if (newSpeed > 0) {
            changeSpeed(newSpeed, getCurrentDirection());
        }
    }
}
