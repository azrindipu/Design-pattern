package adapter;

public class AdapteeImpl implements Adaptee {
    @Override
    public void specificRequest() {
        System.out.println("Im from AdapteeImpl");
    }
}
