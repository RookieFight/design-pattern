package com.ryze.absfactory.pizzastore.order;

import com.ryze.absfactory.pizzastore.pizza.*;

public class SHFactory implements AbsFactory{
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new SHCheesePizza();
            pizza.setName("上海芝士披萨");
        } else if (type.equals("greek")) {
            pizza = new SHGreekPizza();
            pizza.setName("上海希腊披萨");
        }
        return pizza;
    }
}
