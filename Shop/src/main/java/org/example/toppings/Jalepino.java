package org.example.toppings;

import lld.pizzashop.pizza.PizzaType;

public class Jalepino implements Toppings {
    PizzaType pizza;
    public Jalepino (PizzaType pizza) {
        this.pizza = pizza;
    }

    public float cost() {
        return pizza.cost() + 20;
    }

}
