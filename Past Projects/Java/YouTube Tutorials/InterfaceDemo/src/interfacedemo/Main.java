package interfacedemo;

public class Main {
    public static void main(String[] args) {
//        DeskPhone myPhone = new DeskPhone("123456");
//        myPhone.powerOn();
//        myPhone.callPhone("123456");
//        myPhone.answer();

        MobilePhone mobilePhone = new MobilePhone("123456");
        mobilePhone.powerOn();
        mobilePhone.callPhone("123456");
        mobilePhone.answer();
    }
}
