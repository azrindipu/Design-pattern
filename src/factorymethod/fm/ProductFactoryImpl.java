package factorymethod.fm;

public class ProductFactoryImpl implements ProductFactory{

    @Override
    public Product create() {
        return new ProductImpl();
    }
}
