package OOPBasics;

import java.util.Date;

public class Author {
    private String name;
    private Book[] books;

    public Author(Book[] books, String name) {
        this.name=name;
        this.books = books != null ? books : new Book[0];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books != null ? books : new Book[0];
    }
}
