package decorator.decorate;

import decorator.coffee.Coffee;

public class SoyaDecorator extends Decorator {

    private Coffee coffee;
    private int soyaPrice = 5;

    public SoyaDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + this.soyaPrice;
    }

    @Override
    public String description() {
        return null;
    }
}
