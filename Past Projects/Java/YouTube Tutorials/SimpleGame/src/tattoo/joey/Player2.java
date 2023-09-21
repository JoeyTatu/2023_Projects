package tattoo.joey;

public class Player2 extends Player1 {
    private int health;
    private final boolean armour;

    public Player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damageByGun1() {
        if (armour) {
            this.health -= 20;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is ON. Got hit by gun 1. Health reduced by 20. New health is " + this.health);
        }

        if (!armour) {
            this.health -= 30;
            if (this.health <= 0) {
                this.health = 0;
            }
            System.out.println("Armour is OFF. Got hit by gun 1. Health reduced by 30. New health is " + this.health);
        }
    }

    @Override
    public void damageByGun2() {
        if (armour) {
            this.health -= 40;
            if (this.health <= 0) this.health = 0;

            System.out.println("Armour is ON. Got hit by gun 1. Health reduced by 40. New health is " + this.health);
        }

        if (!armour) {
            this.health -= 50;
            if (this.health <= 0) this.health = 0;

            System.out.println("Armour is OFF. Got hit by gun 1. Health reduced by 50. New health is " + this.health);
        }

        if (this.health == 0) {
            System.out.println(getName() + " is defeated.");
        }
    }

    @Override
    public void heal() {
        if (this.health <= 0) {
            System.out.println(getName() + "'s health is 0. Cannot heal the defeated.");
        } else {
            this.health = 100;
            System.out.println(getName() + "'s health restored. New health is " + this.health);
        }
    }
}
