package com.ryze.absfactory.pizzastore.order;

import com.ryze.absfactory.pizzastore.pizza.HZCheesePizza;
import com.ryze.absfactory.pizzastore.pizza.HZGreekPizza;
import com.ryze.absfactory.pizzastore.pizza.Pizza;

public class HZFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new HZCheesePizza();
            pizza.setName("杭州芝士披萨");
        } else if (type.equals("greek")) {
            pizza = new HZGreekPizza();
            pizza.setName("杭州希腊披萨");
        }
        return pizza;
    }
}
