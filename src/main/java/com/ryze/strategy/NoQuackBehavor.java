package com.ryze.strategy;

/**
 * @author ryze
 * @date 2023-05-08 11:02
 */
public class NoQuackBehavor implements QuackBehavor{
    @Override
    public void quack() {
        System.out.println("不会叫");
    }
}
