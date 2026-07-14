package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LoanTest {
    /*  Constructor doğru kitabı saklıyor mu?
        Constructor doğru üyeyi saklıyor mu?
        isForBook() aynı kitap için true döndürüyor mu?
        Farklı kitap için false döndürüyor mu?
        isForMember() aynı kimlikli üye için true döndürüyor mu?
        Farklı kimlikli üye için false döndürüyor mu?
        toString() beklenen metni döndürüyor mu?    */
    @Test
    public void isItTrueBook() {
        Book bookFirst = new Book("Clean Code",  "Robert Martin",2008);
        Member member = new Member("Harun", 1);
        Loan loan = new Loan(bookFirst, member);
        assertSame(bookFirst,loan.getBook());
    }

    @Test
    public void isItTrueMember() {
        Book bookFirst = new Book("Clean Code",  "Robert Martin",2008);
        Member member = new Member("Harun", 1);
        Loan loan = new Loan(bookFirst, member);
        assertSame(member,loan.getMember());
    }

    @Test
    public void isForBookTest() {
        Book bookFirst = new Book("Clean Code",  "Robert Martin",2008);
        Book bookSecond = new Book("Clean Code",  "Robert Martin",2020);
        Member member = new Member("Harun", 1);
        Loan loan = new Loan(bookFirst, member);
        assertTrue(loan.isForBook(bookSecond));
    }

    @Test
    public void isForMemberTest() {
        Book bookFirst = new Book("Clean Code",  "Robert Martin",2008);
        Member member2 = new Member("Harun", 1);
        Member member = new Member("Mehmet", 1);
        Loan loan = new Loan(bookFirst, member2);
        assertTrue(loan.isForMember(member));
    }

    @Test
    public void toStringReturnsCorrectLoanInformation() {
        Book book = new Book("Clean Code", "Robert Martin", 2008);
        Member member = new Member("Harun", 1);
        Loan loan = new Loan(book, member);

        assertEquals("Clean Code by Robert Martin (2008) loaned to Harun (#1)", loan.toString());
    }
}
