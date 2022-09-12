package proxy;

public class BookParser implements Subject{

    private static BookParser bookParser = null;
    private int numberOfPages;
    private int numberOfChapetr;

    private BookParser(String string) {
        this.parseBook(string);
    }

    private BookParser() {
    }

    public static BookParser getInstance(String string){
        if(bookParser == null){
            bookParser = new BookParser(string);
        }
        return bookParser;
    }

    private void parseBook(String string){
        this.numberOfPages=100;
        this.numberOfChapetr = 8;
    }

    @Override
    public int getTheNumberOfPages() {
        return this.numberOfPages;
    }

    @Override
    public int getTheNumberOfChapter() {
        return this.numberOfChapetr;
    }
}
