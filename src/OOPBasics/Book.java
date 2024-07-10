package OOPBasics;

import java.util.Date;

public class Book {
    private String title;
    private String isbn;
    private Author[] authors;
    private Date borrowedAt;

    public Book(String title, String isbn, Author[] authors) {
        this.title = title;
        this.isbn = isbn;
        this.authors = authors != null ? authors : new Author[0];
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public void setAuthors(Author[] authors) {
        this.authors = authors != null ? authors : new Author[0];
    }

    public Date getBorrowedAt() {
        return borrowedAt;
    }

    public void setBorrowedAt(Date borrowedAt) {
        this.borrowedAt = borrowedAt;
    }
}
