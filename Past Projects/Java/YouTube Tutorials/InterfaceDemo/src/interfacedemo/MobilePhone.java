package interfacedemo;

public class MobilePhone implements Telephone {
    private String myNumber;
    private boolean isRinging;
    private boolean isPowerOn;


    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Phone powered on");
    }

    @Override
    public void dialler(String phoneNumber) {
        System.out.println("Now calling " + phoneNumber + " on desk phone");
    }

    @Override
    public void answer() {
        if (isRinging && isPowerOn) {
            System.out.println("Answering the mobile phone");
            isRinging = false;
        } else {
//            System.out.println("Phone is not ringing");
        }
    }

    @Override
    public boolean callPhone(String phoneNumber) {
        if (phoneNumber.equals(myNumber) && isPowerOn) {
            isRinging = true;
            System.out.println("Phone is ringing");
        } else {
            System.out.println("Either wrong number entered or phone is off.");
            isRinging = false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
