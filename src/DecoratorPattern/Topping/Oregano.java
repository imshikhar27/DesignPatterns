package DecoratorPattern.Topping;

import DecoratorPattern.PizzaBase.PizzaBaseInterface;

public class Oregano implements ToppingsInterface{
    ToppingsInterface toppingsPizza;
    PizzaBaseInterface pizzaBasePizza;

    public Oregano(ToppingsInterface toppingsPizza){
        this.toppingsPizza = toppingsPizza;
    }
    public Oregano(PizzaBaseInterface pizzaBasePizza){
        this.pizzaBasePizza = pizzaBasePizza;
    }

    @Override
    public int cost() {
        return 30;
    }

    public int makePizza() {
        int costBasePizza = 0;
        if(pizzaBasePizza != null){
            costBasePizza=this.pizzaBasePizza.makePizza();
        }else{
            costBasePizza=this.toppingsPizza.makePizza();
        }

        System.out.println("Adding Oregano topping on pizza \n.............");
        int costOfToppings=this.cost();
        System.out.println("Cost of Oregano: "+costOfToppings);

        return costBasePizza+costOfToppings;
    }
}
