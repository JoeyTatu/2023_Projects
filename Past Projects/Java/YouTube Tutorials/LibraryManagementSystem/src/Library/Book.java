package Library;

public class Book {

    private String title;
    private String author;
    private String publisher;
    private String location;
    private String borrowingStatus;
    private int copiesForSale;
    private int copiesForBorrowing;
    private double price;

    public Book() {
    }

    public Book(String title, String author, String publisher, String location, String borrowingStatus, int copiesForSale, int copiesForBorrowing, double price) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.location = location;
        this.borrowingStatus = borrowingStatus;
        this.copiesForSale = copiesForSale;
        this.copiesForBorrowing = copiesForBorrowing;
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nTitle: " + title +
                "\nAuthor: " + author +
                "\nPublisher: " + publisher +
                "\nLocation: " + location +
                "\nBorrowing status: " + borrowingStatus +
                "\nNum. copies for sale: " + copiesForSale +
                "\nNum. copies for borrowing: " + copiesForBorrowing +
                "\nPrice: €" + price + "\n";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBorrowingStatus() {
        return borrowingStatus;
    }

    public void setBorrowingStatus(String borrowingStatus) {
        this.borrowingStatus = borrowingStatus;
    }

    public int getCopiesForSale() {
        return copiesForSale;
    }

    public void setCopiesForSale(int copiesForSale) {
        this.copiesForSale = copiesForSale;
    }

    public int getCopiesForBorrowing() {
        return copiesForBorrowing;
    }

    public void setCopiesForBorrowing(int copiesForBorrowing) {
        this.copiesForBorrowing = copiesForBorrowing;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
