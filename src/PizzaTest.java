public class PizzaTest {

    public static void main(String[] args) {
        Pizza pizza1 = new Pizza(Pizza.PizzaSize.LARGE, 1, 1, 2); // Large pizza with various toppings
        Pizza pizza2 = new Pizza(Pizza.PizzaSize.SMALL, 0, 0, 0); // Small pizza with no toppings

        System.out.println(pizza1.getDescription() + ", costing $" + pizza1.calcCost());
        System.out.println(pizza2.getDescription() + ", costing $" + pizza2.calcCost());
    }
}