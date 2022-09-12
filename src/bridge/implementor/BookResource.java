package bridge.implementor;

public class BookResource implements Resource {
    private Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String getText() {
        return this.book.getAuthor();
    }

    @Override
    public String getImage() {
        return this.book.getImage();
    }

    @Override
    public String getTitle() {
        return this.book.getTitle();
    }
}
