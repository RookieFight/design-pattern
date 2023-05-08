package com.ryze.strategy;

/**
 * @author ryze
 * @date 2023-05-08 11:02
 */
public class GoodFlyBehavor implements FlyBehavor{
    @Override
    public void fly() {
        System.out.println("飞得高");
    }
}
