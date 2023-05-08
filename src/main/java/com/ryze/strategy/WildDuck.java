package com.ryze.strategy;

/**
 * @author ryze
 * @date 2023-05-08 11:00
 */
public class WildDuck extends Duck{

    /**
     * 根据对应特性构造器中加载不同行为实例
     */
    public WildDuck() {
        flyBehavor = new GoodFlyBehavor();
        quackBehavor = new GagaQuackBehavor();
    }

    @Override
    protected void display() {
        System.out.println("野鸭子");
    }
}
