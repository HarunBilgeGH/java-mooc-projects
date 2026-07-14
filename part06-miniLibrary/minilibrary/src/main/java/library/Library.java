package library;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<Member> members;
    private ArrayList<Loan> loans;
    public Library(){
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.loans = new ArrayList<>();
    }
    public void addBook(Book book) {
        if (!(this.books.contains(book))) {
            this.books.add(book);
        }
    }
    public void addMember(Member member) { 
        if (!(this.members.contains(member))) {
            this.members.add(member);
        }
    }

    public boolean containsBook(Book book) {
        return this.books.contains(book);
    }
    public boolean containsMember(Member member) {
        return this.members.contains(member);
    }

    public boolean isLoaned(Book book) {
        for (Loan loan : loans) {
            if (loan.isForBook(book)) {
                return true;
            }
        }
        return false;
    }

    public boolean loanBook(Book book, Member member) {
    if (containsBook(book) && containsMember(member) && !isLoaned(book)) {

        this.loans.add(new Loan(book, member));
        return true;
    }

    return false;
    }

    public boolean returnBook(Book book) {
        for (int index = 0; index < this.loans.size(); index++) {
            Loan loan = this.loans.get(index);

            if (loan.isForBook(book)) {
                this.loans.remove(index);
                return true;
            }
        }
        return false;
    }

    

    public void printBooks() {
        for (Book book : this.books) {
            System.out.println(book);
        }
    }
    public void printMembers() {
        for (Member member : this.members) {
            System.out.println(member);
        } 
    }
    public void printLoans() {
        for (Loan loan : this.loans) {
            System.out.println(loan);
        }
    }

    public int numberOfBooks() {
        return this.books.size();
    }
    public int numberOfMembers() {
        return this.members.size();
    }
    public int numberOfLoans() {
        return this.loans.size();
    }
}
