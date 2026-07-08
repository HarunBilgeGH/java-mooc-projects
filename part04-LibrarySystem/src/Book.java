public class Book {
    private String title;
    private String author;
    private int pages;
    private boolean borrowed;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.borrowed = false;
    }

    public String title() {
        return this.title;
    }

    public String author() {
        return this.author;
    }

    public int pages() {
        return this.pages;
    }

    public boolean isBorrowed() {
        return this.borrowed;
    }

    public void borrowBook() {
        borrowed = true;
    }

    public void returnBook() {
        borrowed = false;
    }

    public boolean longBook() {
        return this.pages>=400;
    }

    public String toString() {
        return this.title + " by " + this.author + ", "+ this.pages + " pages " + (this.borrowed ? "available" : "not available");
    }
}