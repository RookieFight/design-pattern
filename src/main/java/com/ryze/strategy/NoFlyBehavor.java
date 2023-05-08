package com.ryze.strategy;

/**
 * @author ryze
 * @date 2023-05-08 11:01
 */
public class NoFlyBehavor implements FlyBehavor{
    @Override
    public void fly() {
        System.out.println("不会飞");
    }
}
