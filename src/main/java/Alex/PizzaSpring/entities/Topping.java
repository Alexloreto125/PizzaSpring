package Alex.PizzaSpring.entities;


import Alex.PizzaSpring.abstractpk.MenuItem;

public class Topping  {
    private String name;

    public Topping(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
