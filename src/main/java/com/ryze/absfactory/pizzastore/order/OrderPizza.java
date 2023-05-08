package com.ryze.absfactory.pizzastore.order;

import com.ryze.absfactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {

    //聚合抽象工厂
    AbsFactory absFactory;

    public OrderPizza(AbsFactory absFactory) {
        setAbsFactory(absFactory);
    }

    private void setAbsFactory(AbsFactory absFactory) {
        Pizza pizza = null;
        String type = "";//用户输入
        this.absFactory = absFactory;
        do {
            type = getOrderType();
            pizza = absFactory.createPizza(type);
            if (null != pizza) {
                pizza.prepare();
                pizza.bake();
                pizza.cut();
                pizza.box();
            } else {
                System.out.println("订购失败");
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
