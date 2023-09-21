package Library;

import java.util.Scanner;

public class RestrictedUser extends User {

    public RestrictedUser(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.operations = new IOOperation[]{
                new ViewBooks(),
                new Search(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalculateFines(),
                new ReturnBook(),
                new Exit()
        };
    }

    public RestrictedUser(String name) {
        super(name);
        this.operations = new IOOperation[]{
                new ViewBooks(),
                new Search(),
                new PlaceOrder(),
                new BorrowBook(),
                new CalculateFines(),
                new ReturnBook(),
                new Exit()
        };
    }

    @Override
    public void menu(Database db, User user) {
        System.out.println("""
                1. View Books
                2. Search
                3. Place Order
                4. Borrow Book
                5. Calculate Fines
                6. Return Book
                7. EXIT""");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        this.operations[choice].operation(db, user);
        scanner.close();
    }

    public String toString() {
        return name + "<N/>" + email + "<N/>" + phoneNumber + "<N/>" + "Restricted";
    }
}
