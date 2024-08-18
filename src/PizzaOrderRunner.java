public class PizzaOrderRunner {

    public static void main(String[] args) {
        PizzaOrder order = new PizzaOrder();

        Pizza pizza1 = new Pizza(Pizza.PizzaSize.MEDIUM, 2, 0, 1);
        Pizza pizza2 = new Pizza(Pizza.PizzaSize.LARGE, 0, 3, 0);


        order.addPizza(pizza1);
        order.addPizza(pizza2);


        double totalCost = order.calcTotal();
        System.out.println("Total cost of the order: $" + totalCost);
    }
}