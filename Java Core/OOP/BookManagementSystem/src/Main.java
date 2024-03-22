import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        int choice;
        do {
            System.out.println("\nTasks Menu:");
            System.out.println("1. Insert new book");
            System.out.println("2. View list of books");
            System.out.println("3. Average Price");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addBook(scanner, books);
                    break;
                case 2:
                    viewBooks(books);
                    break;
                case 3:
                    calculateAndDisplayAveragePrice(books);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);
    }

    private static void calculateAndDisplayAveragePrice(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books available.");
            return;
        }
        for(Book book : books) {
            book.calculate();
            book.display();
        }
    }

    private static void viewBooks(ArrayList<Book> books) {
        if(books.isEmpty()) {
            System.out.println("No book is available!");
            return;
        }
        for(Book book : books) {
            book.display();
        }
    }

    private static void addBook(Scanner scanner, ArrayList<Book> books) {
        System.out.println("Enter name of the book: ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.println("Enter publish date: ");

        String publishDate = scanner.nextLine();
        System.out.println("Enter author of the book");

        String author = scanner.nextLine();
        System.out.println("Enter language of the book");

        String language = scanner.nextLine();
        int[] prices = new int[5];
        for(int i = 0; i< 5; i++) {
            System.out.println("Price" + (i+1) + "is: ");
            prices[i] = scanner.nextInt();
        }
        books.add(new Book(name, publishDate, author, language, prices));
    }
}