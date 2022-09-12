package decorator.coffee;

import decorator.coffee.Coffee;

public class ExpressCoffee extends Coffee {

    private int basePrice = 20;
    private String baseDescription = "Express Coffee";

    @Override
    public int cost() {
        return this.basePrice;
    }

    @Override
    public String description() {
        return this.baseDescription;
    }
}
