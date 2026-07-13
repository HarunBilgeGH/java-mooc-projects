package library;

public class Loan {
    private Book book;
    private Member member;
    public Loan(Book book, Member member) {

    }

    public Book getBook() {
        return book;
    }
    public Member getMember() {
        return member;
    }

    public boolean isForBook(Book book) {
        return false;
    }
    public boolean isForMember(Member member) {
        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}
