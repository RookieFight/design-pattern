package com.ryze.factorymethod.pizzastore.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza2 {

    public OrderPizza2() {
        getOrderPizza();
    }

    private OrderPizza getOrderPizza() {
        OrderPizza orderPizza = null;
        String city = getCity();
        if (city.equals("杭州")) {
            orderPizza = new HZOrderPizza();
        } else if (city.equals("上海")) {
            orderPizza = new SHOrderPizza();
        }
        return orderPizza;
    }

    private String getCity() {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("输入地区:");
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
