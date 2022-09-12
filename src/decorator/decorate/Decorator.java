package decorator.decorate;

import decorator.coffee.Coffee;

abstract public class Decorator extends Coffee {
    abstract public int cost();
    abstract public String description();
}
