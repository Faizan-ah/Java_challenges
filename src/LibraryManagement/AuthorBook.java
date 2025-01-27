package LibraryManagement;

public class AuthorBook {
    private String authorId;
    private String bookId;

    public AuthorBook(String authorId, String bookId) {
        this.authorId = authorId;
        this.bookId = bookId;
    }

    public String getAuthorId() {
        return authorId;
    }

    public void setAuthorId(String authorId) {
        this.authorId = authorId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }
}