package Library;

import java.util.Scanner;

public class Admin extends User {

    public Admin(String name) {
        super(name);
        this.operations = new IOOperation[] {
                new ViewBooks(),
                new AddBook(),
                new DeleteBook(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    public Admin(String name, String email, String phoneNumber) {
        super(name, email, phoneNumber);
        this.operations = new IOOperation[] {
                new ViewBooks(),
                new AddBook(),
                new DeleteBook(),
                new Search(),
                new DeleteAllData(),
                new ViewOrders(),
                new Exit()
        };
    }

    @Override
    public void menu(Database db, User user) {
        System.out.println("""
                1. View Books
                2. Add Book
                3. Delete Book
                4. Search
                5. Delete all data
                6. View Orders
                7. EXIT""");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        this.operations[choice].operation(db, user);
        scanner.close();
    }

    public String toString() {
        return name + "<N/>" + email + "<N/>" + phoneNumber + "<N/>" + "Admin";
    }
}
