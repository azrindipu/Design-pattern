package adapter;

public class Client {
    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void callAdapter(){
        target.request();
    }
}
