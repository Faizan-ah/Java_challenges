package LibraryManagement;

import java.util.ArrayList;

public class AuthorBookManager {
    private final ArrayList<Author> authors;
    private final ArrayList<Book> books;
    private final ArrayList<AuthorBook> authorToBook;

    public AuthorBookManager() {
        this.authors = new ArrayList<>();
        this.books = new ArrayList<>();
        this.authorToBook = new ArrayList<>();
    }

    public void addAuthorToBook(AuthorBook authorBook) {
        if (!this.authorToBook.contains(authorBook)) {
            this.authorToBook.add(authorBook);
        } else {
            System.out.println("Author already added to Book");
        }
    }

    public void addBook(Book book) {
        if (!this.books.contains(book)) {
            this.books.add(book);
        } else {
            System.out.println("Book already present");
        }
    }

    public void addAuthor(Author author) {
        if (!this.authors.contains(author)) {
            this.authors.add(author);
        } else {
            System.out.println("Author already present");
        }
    }

    public void deleteAuthorFromBook(String authorId) {
        AuthorBook authorToDelete = this.authorToBook.stream().
                filter(author -> authorId.equals(author.getAuthorId())).findAny().orElse(null);
        if (authorToDelete!=null) {
            this.authorToBook.remove(authorToDelete);
        } else {
            System.out.println("Author not found");
        }
    }

    public void deleteAuthor(String id) {
        Author authorToDelete = getAuthors().stream().
                filter(author -> id.equals(author.getId())).findAny().orElse(null);
        if (authorToDelete!=null) {
            this.authors.remove(authorToDelete);
        } else {
            System.out.println("Author not found");
        }
    }


    public void deleteBook(String id) {
        Book bookToDelete = getBooks().stream().
                filter(book -> id.equals(book.getId())).findAny().orElse(null);
        if (bookToDelete!=null) {
            this.books.remove(bookToDelete);
        } else {
            System.out.println("Book not found");
        }
    }

    public void updateBook(Book book) {
        Book bookToUpdate = getBooks().stream().
                filter(b -> book.getId().equals(b.getId())).findAny().orElse(null);
        if (bookToUpdate!=null) {
            int index = this.books.indexOf(bookToUpdate);
            this.books.set(index,bookToUpdate);
        } else {
            System.out.println("Book not found");
        }
    }


    public void updateAuthor(Author author) {
        Author authorToUpdate = getAuthors().stream().
                filter(a -> author.getId().equals(a.getId())).findAny().orElse(null);
        if (authorToUpdate!=null) {
            int index = this.authors.indexOf(authorToUpdate);
            this.authors.set(index, authorToUpdate);
        } else {
            System.out.println("Author not found");
        }
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public ArrayList<AuthorBook> getAuthorToBook() {
        return authorToBook;
    }
}
