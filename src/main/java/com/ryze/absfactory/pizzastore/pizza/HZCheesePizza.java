package com.ryze.absfactory.pizzastore.pizza;

public class HZCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + "材料准备完成");
    }
}
