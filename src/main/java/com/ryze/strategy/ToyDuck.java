package com.ryze.strategy;

/**
 * @author ryze
 * @date 2023-05-08 11:00
 */
public class ToyDuck extends Duck{

    /**
     * 根据对应特性构造器中加载不同行为实例
     */
    public ToyDuck() {
        flyBehavor = new NoFlyBehavor();
        quackBehavor = new NoQuackBehavor();
    }

    @Override
    protected void display() {
        System.out.println("玩具鸭子");
    }
}
