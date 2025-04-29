package ide3;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int yearPublished, int itemID, int numberOfPages) {
        super(title, author, yearPublished, itemID);
        this.numberOfPages = numberOfPages;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Pages: " + numberOfPages);
    }
}

