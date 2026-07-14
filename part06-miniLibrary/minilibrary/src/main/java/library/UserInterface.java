package library;

import java.util.Scanner;

public class UserInterface {
    private Library library;
    private Scanner scanner;

    public UserInterface(Library library, Scanner scanner) {
        this.library = library;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            printCommands();
            System.out.print("Command: ");
            String command = this.scanner.nextLine();

            if (command.equalsIgnoreCase("x")) {
                break;
            }

            if (command.equals("1")) {
                addBook();
            } else if (command.equals("2")) {
                addMember();
            } else if (command.equals("3")) {
                loanBook();
            } else if (command.equals("4")) {
                returnBook();
            } else if (command.equals("5")) {
                System.out.println("Books:");
                this.library.printBooks();
            } else if (command.equals("6")) {
                System.out.println("Members:");
                this.library.printMembers();
            } else if (command.equals("7")) {
                System.out.println("Loans:");
                this.library.printLoans();
            } else {
                System.out.println("Unknown command.");
            }

            System.out.println();
        }
    }

    private void addBook() {
        Book book = readBook();

        if (this.library.containsBook(book)) {
            System.out.println("Book already exists.");
            return;
        }

        this.library.addBook(book);
        System.out.println("Book added.");
    }

    private void addMember() {
        Member member = readMember();

        if (this.library.containsMember(member)) {
            System.out.println("Member already exists.");
            return;
        }

        this.library.addMember(member);
        System.out.println("Member added.");
    }

    private void loanBook() {
        System.out.println("Book information:");
        Book book = readBook();

        System.out.println("Member information:");
        Member member = readMember();

        if (this.library.loanBook(book, member)) {
            System.out.println("Loan successful.");
        } else {
            System.out.println("Loan failed.");
        }
    }

    private void returnBook() {
        Book book = readBook();

        if (this.library.returnBook(book)) {
            System.out.println("Book returned.");
        } else {
            System.out.println("Return failed.");
        }
    }

    private Book readBook() {
        System.out.print("Title: ");
        String title = this.scanner.nextLine();

        System.out.print("Author: ");
        String author = this.scanner.nextLine();

        System.out.print("Publication year: ");
        int publicationYear =
                Integer.valueOf(this.scanner.nextLine());

        return new Book(title, author, publicationYear);
    }

    private Member readMember() {
        System.out.print("Name: ");
        String name = this.scanner.nextLine();

        System.out.print("Member ID: ");
        int memberId = Integer.valueOf(this.scanner.nextLine());

        return new Member(name, memberId);
    }

    private void printCommands() {
        System.out.println("Commands:");
        System.out.println("1 - add book");
        System.out.println("2 - add member");
        System.out.println("3 - loan book");
        System.out.println("4 - return book");
        System.out.println("5 - print books");
        System.out.println("6 - print members");
        System.out.println("7 - print loans");
        System.out.println("X - stop");
    }
}