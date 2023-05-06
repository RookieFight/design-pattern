package com.ryze.factorymethod.pizzastore.order;

import com.ryze.factorymethod.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  工厂方法模式   将简单工厂中的方法抽象出来，再根据具体情况交由具体的工厂子类实现
 */
public abstract class OrderPizza {

    /**
     * 定义抽象方法  让各个工厂子类实现
     */
    abstract Pizza createPizza(String type);

    /**
     *
     * 构造器获取对象实例
     */
    public OrderPizza() {
        Pizza pizza = null;
        String type;
        do {
            type = getOrderType();
            pizza = createPizza(type);
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("没有这种披萨");
                break;
            }
        } while (true);
    }

    /**
     * 输入披萨类型
     * @return
     */
    private String getOrderType() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入披萨种类:");
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
