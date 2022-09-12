package proxy;

public class Main {
    public static void main(String[] args){
        String haveToParse ="";
        Subject proxy = new Proxy(haveToParse);
        System.out.println("Number of Chapter: "+proxy.getTheNumberOfChapter());
        System.out.println("Number of Pages: "+proxy.getTheNumberOfPages());
    }
}
