package Alex.PizzaSpring.abstractpk;

public abstract class MenuItem {
    private String name;
    private double price;

    private int calories;

    public MenuItem(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrezzo() {
        return price;
    }

    public void setPrezzo(double price) {
        this.price = price;
    }

    public int getCalorie() {
        return calories;
    }

    public void setCalorie(int calories) {
        this.calories = calories;
    }
}