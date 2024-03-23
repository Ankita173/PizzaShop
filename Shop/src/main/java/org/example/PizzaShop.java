package org.example;

import org.example.pizza.PizzaEnum;
import org.example.toppings.ToppingsEnum;

public class PizzaShop {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzafactoryImpl();

        pizzaFactory.selectPizza(PizzaEnum.Margerita);

        ToppingsEnum[] top = {ToppingsEnum.SweetCorn, ToppingsEnum.Jalepino};

        System.out.println(pizzaFactory.getPizzaCost(top));
    }


}
