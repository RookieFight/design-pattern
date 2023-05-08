package com.ryze.absfactory.pizzastore.order;

import com.ryze.absfactory.pizzastore.pizza.Pizza;

/**
 * 定义抽象工厂接口
 */
public interface AbsFactory {

    /**
     * 定义抽象工厂方法
     * @param type
     * @return
     */
    Pizza createPizza(String type);
}
