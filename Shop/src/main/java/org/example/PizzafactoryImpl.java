package org.example;

import lld.pizzashop.pizza.Farmhouse;
import lld.pizzashop.pizza.Margerita;
import lld.pizzashop.pizza.PizzaEnum;
import lld.pizzashop.toppings.Jalepino;
import lld.pizzashop.toppings.SweetCorn;
import lld.pizzashop.toppings.ToppingsEnum;

public class PizzafactoryImpl extends PizzaFactory{

    public void selectPizza(PizzaEnum type) {
        switch (type) {
            case Margerita :
                pizza = new Margerita();
                break;
            case Farmhouse :
                pizza = new Farmhouse();
                break;
        }
    }

    public float getPizzaCost(ToppingsEnum[] toppings) {
        for (ToppingsEnum topping : toppings) {
            switch (topping) {
                case Jalepino:
                    pizza = new Jalepino(pizza);
                    break;
                case SweetCorn:
                    pizza = new SweetCorn(pizza);
                    break;
            }
        }
        return pizza.cost();
    }
}
