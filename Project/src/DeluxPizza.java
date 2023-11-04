// DeluxPizza class inherits Pizza class and already has extra Cheese and Toppings
public class DeluxPizza extends Pizza {
    // constructor with one parameter vegan
    public DeluxPizza(boolean vegan) {
        // call the super constructor with vegan parameter
        super(vegan);
        // add extra cheese and toppings to the delux pizza
        super.addExtraCheese();
        super.addExtraToppings();
    }

}