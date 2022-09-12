package factorymethod.fm;

public class Main {

    public static void main(String[] args){
        ProductFactory factory = new ProductFactoryImpl();
        Product product01 = factory.create();
        Product product02 = factory.create();
    }
}
