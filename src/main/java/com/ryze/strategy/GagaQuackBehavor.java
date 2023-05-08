package com.ryze.strategy;

/**
 * @author ryze
 * @date 2023-05-08 11:03
 */
public class GagaQuackBehavor implements QuackBehavor{
    @Override
    public void quack() {
        System.out.println("嘎嘎叫");
    }
}
