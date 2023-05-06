package com.ryze.factorymethod.pizzastore.pizza;

import lombok.Setter;

/**
 * 定义抽象类基类
 */
public abstract class Pizza {

    @Setter
    protected String name;
    /**
     * 准备材料交由子类实现
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name+"烘烤完成");
    }

    public void cut() {
        System.out.println(name+"切割完成");
    }

    public void box() {
        System.out.println(name+"打包完成");
    }
}
