package com.ryze.simplefactory.pizzastore.order;

import com.ryze.simplefactory.pizzastore.pizza.CheesePizza;
import com.ryze.simplefactory.pizzastore.pizza.ChinesePizza;
import com.ryze.simplefactory.pizzastore.pizza.GreekPizza;
import com.ryze.simplefactory.pizzastore.pizza.Pizza;


/**
 * 使用简单工厂创建披萨
 */
public class SimpleFactory {

    //提供一个获取实例的方法
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
            pizza.setName("奶酪披萨");
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
            pizza.setName("希腊披萨");
        } else if (type.equals("chinese")) {
            pizza = new ChinesePizza();
            pizza.setName("中国披萨");
        }
        return pizza;
    }
}
