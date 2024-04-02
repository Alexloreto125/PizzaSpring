package Alex.PizzaSpring.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {

    public Pizza margherita(Topping prosciutto, Topping ananas) {
        Pizza pizza = new Pizza("Prosciutto E Funghi", 7.99, Arrays.asList(prosciutto, ananas));
        return pizza;
    }

    @Bean
    public Topping prosciutto() {
        return new Topping("Salamino");
    }

    @Bean
    public Topping ananas() {
        return new Topping("Ananas");
    }

    @Bean
    public Menu menu(List<Pizza> pizzas, List<Bevande> bevande) {
        return new Menu(pizzas, bevande);
    }


}

