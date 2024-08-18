public class Pizza {


    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamToppings;
    public PizzaSize size;

    public Pizza(PizzaSize size, int cheeseToppings, int pepperoniToppings, int hamToppings) {
        this.size = size;
//        this.size = String.valueOf(size);
        this.cheeseToppings = cheeseToppings;
        this.pepperoniToppings = pepperoniToppings;
        this.hamToppings = hamToppings;
    }
    // this second constructor is a default constructor, so it's basically an empty pizza that can be modified
    public Pizza() {
        this.size = PizzaSize.MEDIUM; // gives pizza a default size of medium
        this.cheeseToppings = 0;
        this.pepperoniToppings = 0;
        this.hamToppings = 0;
    }
    //enum allows flexibility, but is also a more safe a proper way to code things like sizes that will be constant
    public enum PizzaSize{
        SMALL,MEDIUM,LARGE;
    }

    public PizzaSize getSize() {
        return size;
    }
    public void setSize(PizzaSize size) {
        this.size = size;
    }


    public int getCheeseToppings(){
        return cheeseToppings;
    }
    public void setCheeseToppings(int cheese){
        this.cheeseToppings = cheese;
    }
    public int getPepperoniToppings() {
        return pepperoniToppings;
    }
    public void setPepperoniToppings(int pepperoni) {
        this.pepperoniToppings = pepperoni;
    }
    public int getHamToppings() {
        return hamToppings;
    }
    public void setHamToppings(int ham) {
        this.hamToppings = ham;
    }


    public double calcCost() {
        double basePrice;

//switch statement has cases which are the parameters that are to be followed//
        // followed until you reach break which signifies the end of that case until you go//
        //to the next one and so on//
        switch (size) {
            case SMALL:
                basePrice = 10;
                break;
            case MEDIUM:
                basePrice = 12;
                break;
            case LARGE:
                basePrice = 14;
                break;
            default:
                // Handle unexpected enum values (optional)
                throw new IllegalArgumentException("Unexpected PizzaSize value");
        }


        // Add cost of toppings (assuming $2 per topping)
        int totalToppings = cheeseToppings + pepperoniToppings + hamToppings;
        double toppingCost = totalToppings * 2;


        return basePrice + toppingCost;
    }
    public String getDescription() {
        StringBuilder description = new StringBuilder(); //StringBuilder allows string manipulation without having to repeatedly type the same thing over//
        description.append(size + " pizza with:");
// append is a StringBuilder method that alows the size of the pizza to be change//
        // it also allows you to iterate through the conditions(toppings)//

        // Check and append topping quantities
        if (cheeseToppings > 0) {
            description.append(" ").append(cheeseToppings).append(" cheese toppings");
        }
        if (pepperoniToppings > 0) {
            description.append(", ").append(pepperoniToppings).append(" pepperoni toppings");
        }
        if (hamToppings > 0) {
            description.append(", ").append(hamToppings).append(" ham toppings");
        }


        // Obviously to handle case where no toppings are present for whatever reason
        if (cheeseToppings == 0 && pepperoniToppings == 0 && hamToppings == 0) {
            description.append(" no toppings");
        }


        return description.toString();
    }
}