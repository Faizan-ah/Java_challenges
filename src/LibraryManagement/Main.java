package LibraryManagement;

import java.util.ArrayList;

public class Main {
    public static void library() {
        AuthorBookManager authorBookManager = new AuthorBookManager();

        User user = new User("1", "Syed");

        Author author1 = new Author("1", "Faizan");
        Author author2 = new Author("2", "Ahmed");

        Book book1 = new Book("1", "Book 1", "12345");
        Book book2 = new Book("2", "Book 2", "54321");

        authorBookManager.addBook(book1);
        authorBookManager.addBook(book2);
        authorBookManager.addBook(book1);
        authorBookManager.addAuthor(author1);
        authorBookManager.addAuthor(author2);

        AuthorBook authorBook1 = new AuthorBook(author1.getId(), book1.getId());
        AuthorBook authorBook2 = new AuthorBook(author2.getId(), book1.getId());

        authorBookManager.addAuthorToBook(authorBook1);
        authorBookManager.addAuthorToBook(authorBook2);
        authorBookManager.addAuthorToBook(authorBook1);

        authorBookManager.deleteAuthor(author1.getId());
        authorBookManager.deleteAuthorFromBook(author1.getId());

        book1.setTitle("Updated Book");
        authorBookManager.updateBook(book1);

        ArrayList<Author> authors = authorBookManager.getAuthors();
        ArrayList<Book> books = authorBookManager.getBooks();
        ArrayList<AuthorBook> authorBooks = authorBookManager.getAuthorToBook();

        user.borrowBook(book1, books);
        user.borrowBook(book2, books);
        user.removeBook(book1);
        ArrayList<Book> borrowedBooksByUser = user.getBorrowedBooks();


        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.println(author.getName());
        }

        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }

        System.out.println("Authors and Books:");
        for (AuthorBook authorBook : authorBooks) {
            System.out.println("author id " + authorBook.getAuthorId() + " is in book of id " + authorBook.getBookId());
        }

        System.out.println("Users " + user.getId() + " borrowed books:");
        for (Book book : borrowedBooksByUser) {
            System.out.println(book.getTitle());
        }
    }
}
