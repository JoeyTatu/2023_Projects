package Library;

public class ViewBooks implements IOOperation{
    @Override
    public void operation(Database db, User user) {
        System.out.println("View Books");
    }
}
