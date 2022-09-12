package proxy;

public class Proxy implements Subject {

    private String haveToParse;
    private BookParser bookParser;

    public Proxy(String string) {
        this.haveToParse = string;
    }


    @Override
    public int getTheNumberOfPages() {
        this.bookParser = BookParser.getInstance(haveToParse);
        return bookParser.getTheNumberOfPages();
    }

    @Override
    public int getTheNumberOfChapter() {
        this.bookParser = BookParser.getInstance(haveToParse);
        return this.bookParser.getTheNumberOfChapter();
    }
}
