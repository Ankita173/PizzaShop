package org.example;


import org.example.pizza.PizzaEnum;
import org.example.pizza.PizzaType;
import org.example.toppings.ToppingsEnum;

public abstract class PizzaFactory {
    PizzaType pizza;

    public abstract void selectPizza(PizzaEnum type);

    public abstract float getPizzaCost(ToppingsEnum[] toppings);

}
