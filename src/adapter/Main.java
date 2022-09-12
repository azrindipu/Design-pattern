package adapter;

public class Main {
    public static void main(String[] args){

        Adaptee adaptee = new AdapteeImpl();
        Adapter adapter = new Adapter(adaptee);
        Client client = new Client(adapter);
        client.callAdapter();
    }
}
