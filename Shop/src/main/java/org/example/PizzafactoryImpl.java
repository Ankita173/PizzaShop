package org.example;

import org.example.pizza.Farmhouse;
import org.example.pizza.Margerita;
import org.example.pizza.PizzaEnum;
import org.example.toppings.Jalepino;
import org.example.toppings.SweetCorn;
import org.example.toppings.ToppingsEnum;

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
