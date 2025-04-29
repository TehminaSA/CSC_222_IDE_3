package ide3;

public class AudioBook extends LibraryItem {
    private int duration;
    public AudioBook (String title, String author, int yearPublished, int itemID, int duration) {
        super(title, author, yearPublished, itemID);
        this.duration = duration;
    }
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Duration (in minutes): " + duration);
    }
}


