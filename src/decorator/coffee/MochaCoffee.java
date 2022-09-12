package decorator.coffee;


public class MochaCoffee extends Coffee {

    private int basePrice = 10;
    private String baseDescription = "Mocha Coffee";

    @Override
    public int cost() {
        return this.basePrice;
    }

    @Override
    public String description() {
        return this.baseDescription;
    }
}
