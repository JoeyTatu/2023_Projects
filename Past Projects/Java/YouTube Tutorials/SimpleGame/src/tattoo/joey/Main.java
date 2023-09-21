package tattoo.joey;

public class Main {
    public static void main(String[] args) {
        Player1 john = new Player1("John", "sword", 100);
//        System.out.println(player.getName());
//        System.out.println(player.getHealth());
//        System.out.println(player.getWeapon());
//
//        john.damageByGun1();
//        john.damageByGun1();
//        john.damageByGun2();
//        john.heal();


        Player2 sam = new Player2("Sam", "machine gun", 80, false);

        sam.damageByGun1();
        sam.damageByGun1();
        sam.damageByGun2();
        sam.heal();
    }
}
