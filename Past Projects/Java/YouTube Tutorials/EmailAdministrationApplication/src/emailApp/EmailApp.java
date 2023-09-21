package emailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email email1 = new Email("John", "Smith");

        email1.setAlternativeEmail();
        email1.setMailboxCapacity();
        email1.changePassword();

        System.out.println("\n\n");
        System.out.println(email1.showInfo());
    }
}
