package DecoratorPattern.Topping;

import DecoratorPattern.PizzaBase.PizzaBaseInterface;

public class ExtraCheese implements ToppingsInterface{
    ToppingsInterface toppingsPizza;
    PizzaBaseInterface pizzaBasePizza;

    public ExtraCheese(ToppingsInterface toppingsPizza){
        this.toppingsPizza = toppingsPizza;
    }
    public ExtraCheese(PizzaBaseInterface pizzaBasePizza){
        this.pizzaBasePizza = pizzaBasePizza;
    }

    @Override
    public int cost() {
        return 10;
    }

    public int makePizza() {
        int costBasePizza = 0;
        if(pizzaBasePizza != null){
            costBasePizza=this.pizzaBasePizza.makePizza();
        }else{
            costBasePizza=this.toppingsPizza.makePizza();
        }

        System.out.println("Adding Extra cheese topping on pizza \n.............");
        int costOfToppings=this.cost();
        System.out.println("Cost of Extra cheese: "+costOfToppings);

        return costBasePizza+costOfToppings;
    }
}
