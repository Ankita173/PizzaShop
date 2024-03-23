package org.example;

import lld.pizzashop.pizza.PizzaEnum;
import lld.pizzashop.pizza.PizzaType;
import lld.pizzashop.toppings.ToppingsEnum;

public abstract class PizzaFactory {
    PizzaType pizza;

    public abstract void selectPizza(PizzaEnum type);

    public abstract float getPizzaCost(ToppingsEnum[] toppings);

}
