package OOPBasics;

public class User {
    private String name;
    private Book[] borrowedBooks;
    private boolean isBanned;

    public User(String name, Book[] borrowedBooks, boolean isBanned) {
        this.name = name;
        this.borrowedBooks = borrowedBooks;
        this.isBanned = isBanned;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Book[] getBorrowedBooks() {
        return borrowedBooks;
    }

    public void setBorrowedBooks(Book[] borrowedBooks) {
        this.borrowedBooks = borrowedBooks;
    }

    public boolean isBanned() {
        return isBanned;
    }

    public void setBanned(boolean banned) {
        isBanned = banned;
    }
}
