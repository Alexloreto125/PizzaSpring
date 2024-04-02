package Alex.PizzaSpring.entities;

import java.util.List;

public class Menu {
    private List<Pizza> pizzas;
    private List<Bevande> bevande;

    public Menu(List<Pizza> pizzas, List<Bevande> bevande) {
        this.pizzas = pizzas;
        this.bevande = bevande;
    }

    public List<Pizza> getPizza() {
        return pizzas;
    }

    public void setPizza(List<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public List<Bevande> getBevande() {
        return bevande;
    }

    public void setBevande(List<Bevande> bevande) {
        this.bevande = bevande;
    }
}