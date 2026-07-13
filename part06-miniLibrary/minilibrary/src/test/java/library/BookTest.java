package library;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class BookTest {

    @Test
    public void booksWithSameTitleAndAuthorAreEqual() {
        Book bookFirst = new Book("Clean Code",  "Robert Martin",2008);
        Book bookSecond = new Book("Clean Code",  "Robert Martin",2008);

        assertEquals(bookFirst,bookSecond);
    }   

    @Test
    public void booksWithDifferentAuthorAreNotEqual() {
        Book bookFirst = new Book("Clean Code",  "Robert Martin",2008);
        Book bookSecond = new Book("Clean Code",  "Martin Robert",2008);

        assertNotEquals(bookFirst, bookSecond);
    }

    @Test
    public void bookToStringIsCorrect() {
        Book book = new Book("Clean Code",  "Robert Martin",2008);
        assertEquals("Clean Code by Robert Martin (2008)", book.toString());
    }
}