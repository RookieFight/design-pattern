package com.ryze.factorymethod.pizzastore.pizza;

public class SHCheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println(name + "材料准备完成");
    }
}
