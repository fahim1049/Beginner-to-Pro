// base class Pizza
public class Pizza {
    // constructor with 2 parameters vegan and non-vegan
    public Pizza(boolean vegan) {
        this.vegan = vegan;
        // Vegan's price is 30$, non-vegan's price 40$
        if (vegan) {
            this.price = 30;
        } else {
            this.price = 40;
        }
    }

    // instance variables
    private boolean vegan; // true if vegan, false otherwise
    private int price; // price of the pizza

    // methods

    // addExtraCheese method increases the price by 5$
    public void addExtraCheese() {
        this.price += 5;
    }

    // addExtraToppings method increases the price by 10$
    public void addExtraToppings() {
        this.price += 10;
    }

    // takeAway method returns the price of single pie of pizza increased with 20$
    public int takeAway() {
        return this.price + 20;
    }

    // dine method returns the price of single pie of pizza without extra charge
    public int dine() {
        return this.price;
    }

}

