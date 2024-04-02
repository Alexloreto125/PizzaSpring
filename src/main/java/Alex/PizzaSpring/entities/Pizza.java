package Alex.PizzaSpring.entities;

import Alex.PizzaSpring.abstractpk.MenuItem;

import java.util.List;

public class Pizza extends MenuItem {
    private List<Topping> toppings;

    public Pizza(String name, double price, List<Topping> toppings) {
        super(name, price, 0); // Assuming default value for calories
        this.toppings = toppings;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public void setToppings(List<Topping> toppings) {
        this.toppings = toppings;
    }
}
