package ide3;

public class Magazine extends LibraryItem {
    private String issueFrequency;

    public Magazine (String title, String author, int yearPublished, int itemID, String issueFrequency) {
        super(title, author, yearPublished, itemID);
        this.issueFrequency = issueFrequency;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Issue Frequency: " + issueFrequency);
    }
}
