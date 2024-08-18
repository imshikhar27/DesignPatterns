package DecoratorPattern.PizzaBase;

public class VegDelightPizza implements PizzaBaseInterface{
    @Override
    public int makePizza() {
        System.out.println("Making a Veg Delight pizza \n..........");
        int pizzaCost=this.cost();
        System.out.println("Cost of Base: "+pizzaCost);
        return pizzaCost;
    }

    @Override
    public int cost() {
        return 80;
    }
}
