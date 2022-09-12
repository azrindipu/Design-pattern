package decorator;

import decorator.coffee.Coffee;
import decorator.coffee.ExpressCoffee;
import decorator.coffee.MochaCoffee;
import decorator.decorate.CaramellDecorator;
import decorator.decorate.Decorator;
import decorator.decorate.SoyaDecorator;

public class Main {
    public static void main(String[] args){

        Coffee coffee = new ExpressCoffee();
        Decorator decorator = new CaramellDecorator(coffee);
        System.out.println("Cos of caramell coffee is: "+decorator.cost());

        coffee = new MochaCoffee();
        decorator = new SoyaDecorator(coffee);
        System.out.println("Cos of soya coffee is: "+decorator.cost());
    }
}
