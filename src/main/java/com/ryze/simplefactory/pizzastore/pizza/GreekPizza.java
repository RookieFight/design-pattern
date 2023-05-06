package com.ryze.simplefactory.pizzastore.pizza;

public class GreekPizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println(name+"材料准备完成");
    }
}
