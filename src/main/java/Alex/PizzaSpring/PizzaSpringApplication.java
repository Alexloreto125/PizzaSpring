package Alex.PizzaSpring;

import Alex.PizzaSpring.entities.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class PizzaSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PizzaSpringApplication.class, args);
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Menu menu = context.getBean(Menu.class);

		System.out.println("Benvenuto, queste sono le pizze disponibili: ");
		for (Pizza pizza : menu.getPizza()) {
			System.out.println(pizza.getName() + " - " + pizza.getPrezzo());
			System.out.print("Toppings: ");
			for (Topping topping : pizza.getToppings()) {
				System.out.print(topping.getName() + ", ");
			}
			System.out.println();
		}

		System.out.println("Bevande nel menù:");
		for (Bevande bevande : menu.getBevande()) {
			System.out.println(bevande.getName() + " - " + bevande.getPrezzo());
		}
	}
}
