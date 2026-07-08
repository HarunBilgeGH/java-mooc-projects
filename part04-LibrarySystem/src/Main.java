import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        try (Scanner filereader = new Scanner(Paths.get("books.txt"))){
            while(filereader.hasNextLine()) {
                String line = filereader.nextLine();

                String[] parts = line.split(",");

                String title = parts[0];
                String author = parts[1];
                int pages = Integer.valueOf(parts[2]);

                books.add(new Book(title,author,pages));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();

            if (command.equals("quit")) {
                break;
            }

            if (command.equals("list")) {
                printBooks(books);
            }

            if (command.equals("search")) {
                System.out.print("Search word: ");
                String word = scanner.nextLine();
                searchByTitle(books, word);
            }

            if (command.equals("author")) {
                System.out.print("Author: ");
                String author = scanner.nextLine();
                searchByAuthor(books, author);
            }

            if (command.equals("long")) {
                printLongBooks(books);
            }

            if (command.equals("borrow")) {
                System.out.print("Book title: ");
                String title = scanner.nextLine();
                borrowBook(books, title);
            }

            if (command.equals("return")) {
                System.out.print("Book title: ");
                String title = scanner.nextLine();
                returnBook(books, title);
            }

            if (command.equals("available")) {
                printAvailableBooks(books);
            }
        }
    }

    public static void printBooks(ArrayList<Book> books) {
        for (Book book : books) {
            System.out.println(book);
        }
    }

    public static void searchByTitle(ArrayList<Book> books, String word) {
        boolean found = false;
        for (Book book : books) {
            if (book.title().toLowerCase().contains(word.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
            
            if (found != true) {
                System.out.println("Cant find.");
            }
        }
    }

    public static void searchByAuthor(ArrayList<Book> books, String author) {
        boolean found = false;
        for (Book book : books) {
            if (book.author().toLowerCase().contains(author.toLowerCase())) {
                System.out.println(book);
                found = true;
            }
        }
        if (found != true) {
                System.out.println("Cant find.");
            }
    }

    public static void printLongBooks(ArrayList<Book> books) {
        for (Book book : books) {
            if (book.pages()>=400) {
                System.out.println(book);
            }
        }
    }

    public static void borrowBook(ArrayList<Book> books, String title) {
        
    }

    public static void returnBook(ArrayList<Book> books, String title) {
        
    }

    public static void printAvailableBooks(ArrayList<Book> books) {
        
    }
}