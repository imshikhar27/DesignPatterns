package DecoratorPattern;

import DecoratorPattern.PizzaBase.FarmHouseBase;
import DecoratorPattern.PizzaBase.PizzaBaseInterface;
import DecoratorPattern.PizzaBase.VegDelightPizza;
import DecoratorPattern.Topping.ExtraCheese;
import DecoratorPattern.Topping.Oregano;
import DecoratorPattern.Topping.ToppingsInterface;

public class DecoratorPatternMain {
    public static void main(String[] args) {
        ToppingsInterface pizza1=new Oregano(new FarmHouseBase());
        int costOfPizza1=pizza1.makePizza();
        System.out.println("Cost of Pizza 1: "+costOfPizza1);

        PizzaBaseInterface pizza2=new FarmHouseBase();
        int costOfPizza2=pizza2.makePizza();
        System.out.println("Cost of Pizza 2: "+costOfPizza2);

        ToppingsInterface pizza3 = new Oregano(new ExtraCheese(new VegDelightPizza()));
        int costOfPizza3=pizza3.makePizza();
        System.out.println("Cost of Pizza 3: "+costOfPizza3);
    }
}
