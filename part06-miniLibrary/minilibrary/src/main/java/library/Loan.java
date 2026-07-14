package library;

public class Loan {
    private Book book = null;
    private Member member = null;
    public Loan(Book book, Member member) {
        this.book = book;
        this.member = member;
    }

    public Book getBook() {
        return this.book;
    }
    public Member getMember() {
        return this.member;
    }

    public boolean isForBook(Book book) {
        return this.book.equals(book);
    }
    public boolean isForMember(Member member) {
        return this.member.equals(member);
    }

    @Override
    public String toString() {
        return book.toString() + " loaned to " + member.toString(); 
    }
}
