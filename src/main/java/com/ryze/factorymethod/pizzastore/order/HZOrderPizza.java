package com.ryze.factorymethod.pizzastore.order;

import com.ryze.factorymethod.pizzastore.pizza.HZCheesePizza;
import com.ryze.factorymethod.pizzastore.pizza.HZGreekPizza;
import com.ryze.factorymethod.pizzastore.pizza.Pizza;

public class HZOrderPizza extends OrderPizza{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new HZCheesePizza();
            pizza.setName("杭州奶酪披萨");
        } else if (type.equals("greek")) {
            pizza = new HZGreekPizza();
            pizza.setName("杭州希腊披萨");
        }
        return pizza;
    }
}
