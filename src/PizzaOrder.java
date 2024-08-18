public class PizzaOrder {

    private Pizza[] pizzas;
    private int numPizzas;

    public PizzaOrder() {
        this.pizzas = new Pizza[3]; // Array to hold up to 3 pizzas
        this.numPizzas = 0;
    }

    public void addPizza(Pizza pizza) {
        if (numPizzas < 3) {
            pizzas[numPizzas] = pizza;
            numPizzas++;
        } else {
            System.out.println("Order is full, cannot add more pizzas!");
        }
    }

    public double calcTotal() {
        double totalCost = 0;
        for (int i = 0; i < numPizzas; i++) {
            totalCost += pizzas[i].calcCost();
        }
        return totalCost;
    }
}