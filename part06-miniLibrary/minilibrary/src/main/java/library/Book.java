package library;

public class Book {
    private String title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return this.title;
    }
    public String getAuthor() {
        return this.author;
    }
    public int getPublicationYear() {
        return this.publicationYear;
    }

    @Override
    public boolean equals(Object compared) {
        if (this == compared) {
            return true;
        }
        if (!(compared instanceof Book)) {
            return false;
        }
        
        Book comparedBook = (Book) compared;

        if (comparedBook == compared) {
            return true;
        }
        return this.title.equals(comparedBook.title) && this.author.equals(comparedBook.author);
    }

    @Override
    public String toString() {
        return this.title + " by " + this.author + " " +  "(" + this.publicationYear + ")";
    }
}
