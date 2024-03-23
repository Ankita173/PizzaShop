package org.example.toppings;


import org.example.pizza.PizzaType;

public class Jalepino implements Toppings {
    PizzaType pizza;
    public Jalepino (PizzaType pizza) {
        this.pizza = pizza;
    }

    public float cost() {
        return pizza.cost() + 20;
    }

}
