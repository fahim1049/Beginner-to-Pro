

public class Main {
    public static void main(String[] args) {
        // create a vegan delux pizza object
        DeluxPizza veganDelux = new DeluxPizza(true);
        // create a non-vegan delux pizza object
        DeluxPizza nonVeganDelux = new DeluxPizza(false);

        // print the prices of the pizzas for take away and dine options
        System.out.println("Vegan delux pizza:");
        System.out.println("Take away: " + veganDelux.takeAway() + "$");
        System.out.println("Dine: " + veganDelux.dine() + "$");

        System.out.println("Non-vegan delux pizza:");
        System.out.println("Take away: " + nonVeganDelux.takeAway() + "$");
        System.out.println("Dine: " + nonVeganDelux.dine() + "$");

    }
}