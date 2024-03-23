package org.example.toppings;

import org.example.pizza.PizzaType;

public class SweetCorn implements Toppings {
    PizzaType pizza;
    public SweetCorn(PizzaType pizza) {
        this.pizza = pizza;
    }

    public float cost() {
        return pizza.cost() + 15;
    }

}
