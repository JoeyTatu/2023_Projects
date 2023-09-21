package interfacedemo;

public interface Telephone {
    void powerOn();

    void dialler(String phoneNumber);

    void answer();

    boolean callPhone(String phoneNumber);

    boolean isRinging();
}
