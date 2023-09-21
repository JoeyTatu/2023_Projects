package Library;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Database {
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<String> usernames = new ArrayList<>();
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<String> bookTitles = new ArrayList<>();

    private File usersFile = new File("C:\\Users\\Joey\\Library Management System\\Data\\Users");
    private File booksFile = new File("C:\\Users\\Joey\\Library Management System\\Data\\Books");
    private File folder = new File("C:\\Users\\Joey\\Library Management System\\Data");

    public Database() {
        if (!folder.exists()) {
            folder.mkdirs();
        }
        if (!usersFile.exists()) {
            usersFile.mkdirs();
        }
        if (!booksFile.exists()) {
            booksFile.mkdirs();
        }
        getUsers();
    }

    public void AddUser(User u) {
        users.add(u);
        usernames.add(u.getName());
        saveUsers();
    }

    public int login(String phoneNumber, String email) {
        int index = -1;
        for (User u : users) {
            if (u.getPhoneNumber().matches(phoneNumber) && u.getEmail().matches(email)) {
                index = users.indexOf(u);
                break;
            }
        }
        return index;
    }

    public User getUser(int index) {
        return users.get(index);
    }

    public void addBook(Book book) {
        books.add(book);
        bookTitles.add(book.getTitle());
    }

    private void getUsers() {
        String userText = "";
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(usersFile));
            String text;
            while ((text = bufferedReader.readLine()) != null) {
                userText = text + userText;
            }
        } catch (Exception e) {
            System.err.println(e.toString());
        }

        if (userText.matches("") || !userText.isEmpty()) {
            String[] splitter = userText.split("<NewUser/>");
            for (String s : splitter) {
                String[] userArray = s.split("<N/>");
                if (userArray[3].matches("Admin")) {
                    User user = new Admin(userArray[0], userArray[1], userArray[2]);
                    users.add(user);
                    usernames.add(user.getName());
                } else {
                    User user = new RestrictedUser(userArray[0], userArray[1], userArray[2]);
                    users.add(user);
                    usernames.add(user.getName());
                }
            }
        }
    }

    private void saveUsers() {
        String userText = "";
        for (User user : users) {
            userText = userText + users.toString() + "<NewUser/>\n";
        }

        try {
            PrintWriter printWriter = new PrintWriter(usersFile);
            printWriter.print(userText);
            printWriter.close();
//            System.err.println("Data Saved");
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
