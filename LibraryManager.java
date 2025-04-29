package ide3;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        ArrayList<LibraryItem> libraryItems = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        //Main menu
        while (true) {
            System.out.println("\nLibrary Manager");
            System.out.println("1. Add Book");
            System.out.println("2. Add Magazine");
            System.out.println("3. Add Audiobook");
            System.out.println("4. Display All Items");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            String choiceInput = scanner.nextLine().trim();
            if (choiceInput.isEmpty()) {
                System.out.println("Input cannot be blank.");
                continue;
            }

            int choice;
            try {
                choice = Integer.parseInt(choiceInput);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number from 1 to 5.");
                continue;
            }
            //Add Book
            if (choice == 1) {
                //user Input for title cannot be blank
                String title;
                while (true) {
                    System.out.print("Enter title: ");
                    title = scanner.nextLine().trim();
                    if (!title.isEmpty()) break;
                    System.out.println("Input cannot be blank.");
                }
                //Asks for Author cannot be blank
                String author;
                while (true) {
                    System.out.print("Enter author: ");
                    author = scanner.nextLine().trim();
                    if (!author.isEmpty()) break;
                    System.out.println("Input cannot be blank.");
                }
                //Asks for year cannot be blank
                int year;
                while (true) {
                    System.out.print("Enter year published: ");
                    String input = scanner.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("Input cannot be blank.");
                        continue;
                    }
                    try {
                        year = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }
                //User input for itemID cannot be blank
                int itemID;
                while (true) {
                    System.out.print("Enter item ID: ");
                    String input = scanner.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("Input cannot be blank.");
                        continue;
                    }
                    try {
                        itemID = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }
                //User Input for number of pages cannot be empty
                int numPages;
                while (true) {
                    System.out.print("Enter number of pages: ");
                    String input = scanner.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("Input cannot be blank.");
                        continue;
                    }
                    try {
                        numPages = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }

                //adds the the book to the list
                libraryItems.add(new Book(title, author, year, itemID, numPages));
                System.out.println("Book added to the library!");

            } else if (choice == 2) {
                //User Input Magazine title cannot be blank
                String title;
                while (true) {
                    System.out.print("Enter title: ");
                    title = scanner.nextLine().trim();
                    if (!title.isEmpty()) break;
                    System.out.println("Input cannot be blank.");
                }
                //user input for Magazine Author cannot be blank
                String author;
                while (true) {
                    System.out.print("Enter author: ");
                    author = scanner.nextLine().trim();
                    if (!author.isEmpty()) break;
                    System.out.println("Input cannot be blank..");
                }
                //user Input on year published cannot be blank
                int year;
                while (true) {
                    System.out.print("Enter year published: ");
                    String input = scanner.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("Input cannot be blank.");
                        continue;
                    }
                    try {
                        year = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }
                //Item ID number cannot be blank
                int itemID;
                while (true) {
                    System.out.print("Enter item ID: ");
                    String input = scanner.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("Input cannot be blank.");
                        continue;
                    }
                    try {
                        itemID = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }
                //user input the freequency of publication
                String issueFrequency;
                while (true) {
                    System.out.print("Enter issue frequency (e.g., Monthly, Weekly): ");
                    issueFrequency = scanner.nextLine().trim();
                    if (!issueFrequency.isEmpty()) break;
                    System.out.println("Issue frequency cannot be blank.");
                }

                //adds Magazine to list
                libraryItems.add(new Magazine(title, author, year, itemID, issueFrequency));
                System.out.println("Magazine added to the library!");

            } else if (choice == 3) {
                //User input on title cannot be blank
                String title;
                while (true) {
                    System.out.print("Enter title: ");
                    title = scanner.nextLine().trim();
                    if (!title.isEmpty()) break;
                    System.out.println("Input cannot be blank.");
                }
                //User Input Author cannot be blank
                String author;
                while (true) {
                    System.out.print("Enter author: ");
                    author = scanner.nextLine().trim();
                    if (!author.isEmpty()) break;
                    System.out.println("Input cannot be blank.");
                }
                //User input on publication year cannot be blank
                int year;
                while (true) {
                    System.out.print("Enter year published: ");
                    String input = scanner.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("Input cannot be blank.");
                        continue;
                    }
                    try {
                        year = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }

                //User input on ItemID cannot be blank
                int itemID;
                while (true) {
                    System.out.print("Enter item ID: ");
                    String input = scanner.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("Input cannot be blank.");
                        continue;
                    }
                    try {
                        itemID = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }

                int duration;
                // User input on duration of the AudioBook
                while (true) {
                    System.out.print("Enter duration in minutes: ");
                    String input = scanner.nextLine().trim();
                    if (input.isEmpty()) {
                        System.out.println("Input cannot be blank.");
                        continue;
                    }
                    try {
                        duration = Integer.parseInt(input);
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter a valid number.");
                    }
                }
                //Adds AudioBook
                libraryItems.add(new AudioBook(title, author, year, itemID, duration));
                System.out.println("Audiobook added to the library!");

            //dispays all items
            } else if (choice == 4) {
                if (libraryItems.isEmpty()) {
                    System.out.println("No items in the library.");
                } else {
                    for (LibraryItem item : libraryItems) {
                        item.displayInfo();
                        System.out.println();
                    }
                }

            } else if (choice == 5) { //exiting Library Manager
                System.out.println("Exiting Library Manager.");
                break;

            } else { //error handling if non integer or integer <0 or >5 is chosen
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
