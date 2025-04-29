
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLibrary Manager");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add <REPLACE WITH YOUR CHOICE>");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            if (choice == 1) {
                System.out.print("Enter title: ");
//                String title = scanner.nextLine();
//                System.out.print("Enter author: ");
//                String author = scanner.nextLine();
//                System.out.print("Enter year published: ");
//                int year = scanner.nextInt();
//                System.out.print("Enter item ID: ");
//                int itemID = scanner.nextInt();
//                System.out.print("Enter number of pages: ");
//                int numPages = scanner.nextInt();
//
//                libraryItems.add(new Book(title, author, year, itemID, numPages));
//                System.out.println("Book added to the library!");

            } else if (choice == 2) {
                System.out.print("Enter title: ");
//                String title = scanner.nextLine();
//                System.out.print("Enter author: ");
//                String author = scanner.nextLine();
//                System.out.print("Enter year published: ");
//                int year = scanner.nextInt();
//                System.out.print("Enter item ID: ");
//                int itemID = scanner.nextInt();
//                scanner.nextLine();  // Consume newline
//                System.out.print("Enter issue frequency: ");
//                String issueFrequency = scanner.nextLine();
//
//                libraryItems.add(new Magazine(title, author, year, itemID, issueFrequency));
//                System.out.println("Magazine added to the library!");

            } else if (choice == 3) {
                System.out.print("Enter title: ");
                /*
                Include options for your new choice of library item.
                 */



            } else if (choice == 4) {
                for (LibraryItem item : libraryItems) {
                    item.displayInfo();
                    System.out.println();
                }

            } else if (choice == 5) {
                System.out.println("Exiting Library Manager.");
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
