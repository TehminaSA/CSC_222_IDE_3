package ide3;
public class AudioBook extends LibraryItem {
    private int durationMinutes;

    public Audiobook (String title, String author, int yearPublished, int itemID, int durationMinutes) {
        super(title, author, yearPublished, itemID);
        this.durationMinutes = durationMinutes;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration (minutes): " + durationMinutes);
    }
}

