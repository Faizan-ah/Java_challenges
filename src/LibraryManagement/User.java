package LibraryManagement;

import java.util.ArrayList;

public class User {
    private final String id;
    private final String name;
    private final ArrayList<Book> borrowedBooks;
    private final boolean isBanned;

    public User(String id,String name) {
        this.id = id;
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
        this.isBanned = false;
    }

    public String getId() {
        return id;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book, ArrayList<Book> books){
        if(books.contains(book)){
            this.borrowedBooks.add(book);
        }else{
            System.out.println("Book not found");
        }
    }

    public void removeBook(Book book){
        if(this.borrowedBooks.contains(book)){
            this.borrowedBooks.remove(book);
        }else{
            System.out.println("Book not found");
        }
    }

    public String getName() {
        return name;
    }

    public boolean isBanned() {
        return isBanned;
    }

}
