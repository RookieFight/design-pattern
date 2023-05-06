package com.ryze.simplefactory.pizzastore.order;

import com.ryze.simplefactory.pizzastore.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 这种方式简单易理解  但是违反了ocp原则  再添加新的种类时需要增加pizza类同时在orderpizza中也要添加种类选择
 */
public class OrderPizza {

    /*public OrderPizza() {
        Pizza pizza = null;
        String orderType;//披萨类型
        do {
            orderType = getOrderType();
            if (orderType.equals("cheese")) {
                pizza = new CheesePizza();
                pizza.setName("奶酪披萨");
            } else if (orderType.equals("greek")) {
                pizza = new GreekPizza();
                pizza.setName("希腊披萨");
            } else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);
    }*/

    /**
     * 使用简单工厂改进
     */
    SimpleFactory simpleFactory;
    Pizza pizza;
    public OrderPizza(SimpleFactory simpleFactory) {
        setSimpleFactory(simpleFactory);
    }

    /**
     * 使用外部传进来的工厂设置当前工厂
     * @param simpleFactory
     */
    public void setSimpleFactory(SimpleFactory simpleFactory) {
        this.simpleFactory = simpleFactory;
        //在工厂中按照类型创建实例
        String orderType = "";
        do {
            orderType = getOrderType();
            pizza = simpleFactory.createPizza(orderType);
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
