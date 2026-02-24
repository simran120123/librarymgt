import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystem1 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Remove Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    books.add(new Book(title, author));
                    System.out.println("Book Added!");
                    break;

                case 2:
                    for (Book b : books) {
                        b.display();
                    }
                    break;

                case 3:
                    System.out.print("Enter title to search: ");
                    String search = sc.nextLine();
                    for (Book b : books) {
                        if (b.title.equalsIgnoreCase(search)) {
                            b.display();
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter title to remove: ");
                    String remove = sc.nextLine();
                    books.removeIf(b -> b.title.equalsIgnoreCase(remove));
                    System.out.println("Book Removed!");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}