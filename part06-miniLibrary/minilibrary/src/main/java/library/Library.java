package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Loan> loans;
    public Library(){

    }
    public void addBook(Book book) {

    }
    public void addMember(Member member) { 

    }

    public boolean containsBook(Book book) {
        return false;
    }
    public boolean containsMember(Member member) {
        return false;
    }

    public boolean loanBook(Book book, Member member) {
        return false;
    }
    public boolean returnBook(Book book) {
        return false;
    }

    public boolean isLoaned(Book book) {
        return false;
    }

    public void printBooks() {}
    public void printMembers() {}
    public void printLoans() {}

    public int numberOfBooks() {
        return -1;
    }
    public int numberOfMembers() {
        return -1;
    }
    public int numberOfLoans() {
        return -1;
    }
}
