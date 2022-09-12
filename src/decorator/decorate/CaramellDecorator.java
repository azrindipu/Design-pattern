package decorator.decorate;

import decorator.coffee.Coffee;

public class CaramellDecorator extends Decorator {

    private Coffee coffee;
    private int caramellPrice = 10;

    public CaramellDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return this.coffee.cost() + this.caramellPrice;
    }

    @Override
    public String description() {
        return null;
    }
}
