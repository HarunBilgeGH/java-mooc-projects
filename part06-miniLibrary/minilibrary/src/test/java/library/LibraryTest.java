package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class LibraryTest {

    @Test
    public void newLibraryIsEmpty() {
        Library library = new Library();

        assertEquals(0, library.numberOfBooks());
        assertEquals(0, library.numberOfMembers());
        assertEquals(0, library.numberOfLoans());
    }

    @Test
    public void addingBookIncreasesBookCount() {
        Library library = new Library();
        Book book = new Book("Clean Code", "Robert Martin", 2008);

        library.addBook(book);

        assertEquals(1, library.numberOfBooks());
        assertTrue(library.containsBook(book));
    }

    @Test
    public void sameBookCannotBeAddedTwice() {
        Library library = new Library();
        Book first = new Book("Clean Code", "Robert Martin", 2008);
        Book second = new Book("Clean Code", "Robert Martin", 2020);

        library.addBook(first);
        library.addBook(second);

        assertEquals(1, library.numberOfBooks());
    }

    @Test
    public void addingMemberIncreasesMemberCount() {
        Library library = new Library();
        Member member = new Member("Harun", 1);

        library.addMember(member);

        assertEquals(1, library.numberOfMembers());
        assertTrue(library.containsMember(member));
    }

    @Test
    public void sameMemberCannotBeAddedTwice() {
        Library library = new Library();
        Member first = new Member("Harun", 1);
        Member second = new Member("Mehmet", 1);

        library.addMember(first);
        library.addMember(second);

        assertEquals(1, library.numberOfMembers());
    }

    @Test
    public void registeredMemberCanLoanRegisteredBook() {
        Library library = new Library();
        Book book = new Book("Clean Code", "Robert Martin", 2008);
        Member member = new Member("Harun", 1);

        library.addBook(book);
        library.addMember(member);

        assertTrue(library.loanBook(book, member));
        assertTrue(library.isLoaned(book));
        assertEquals(1, library.numberOfLoans());
    }

    @Test
    public void unregisteredBookCannotBeLoaned() {
        Library library = new Library();
        Book book = new Book("Clean Code", "Robert Martin", 2008);
        Member member = new Member("Harun", 1);

        library.addMember(member);

        assertFalse(library.loanBook(book, member));
        assertEquals(0, library.numberOfLoans());
    }

    @Test
    public void unregisteredMemberCannotLoanBook() {
        Library library = new Library();
        Book book = new Book("Clean Code", "Robert Martin", 2008);
        Member member = new Member("Harun", 1);

        library.addBook(book);

        assertFalse(library.loanBook(book, member));
        assertEquals(0, library.numberOfLoans());
    }

    @Test
    public void sameBookCannotBeLoanedTwice() {
        Library library = new Library();
        Book book = new Book("Clean Code", "Robert Martin", 2008);
        Member firstMember = new Member("Harun", 1);
        Member secondMember = new Member("Mehmet", 2);

        library.addBook(book);
        library.addMember(firstMember);
        library.addMember(secondMember);

        assertTrue(library.loanBook(book, firstMember));
        assertFalse(library.loanBook(book, secondMember));
        assertEquals(1, library.numberOfLoans());
    }

    @Test
    public void returningBookRemovesLoan() {
        Library library = new Library();
        Book book = new Book("Clean Code", "Robert Martin", 2008);
        Member member = new Member("Harun", 1);

        library.addBook(book);
        library.addMember(member);
        library.loanBook(book, member);

        assertTrue(library.returnBook(book));
        assertFalse(library.isLoaned(book));
        assertEquals(0, library.numberOfLoans());
    }

    @Test
    public void returningBookThatIsNotLoanedReturnsFalse() {
        Library library = new Library();
        Book book = new Book("Clean Code", "Robert Martin", 2008);

        library.addBook(book);

        assertFalse(library.returnBook(book));
        assertEquals(0, library.numberOfLoans());
    }
}