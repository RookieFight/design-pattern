package com.ryze.strategy;

/**
 * @author ryze
 * @date 2023-05-08 10:35
 */
public class Client {
    public static void main(String[] args) {
        ToyDuck toyDuck = new ToyDuck();
        toyDuck.display();
        toyDuck.swim();
        toyDuck.fly();
        toyDuck.quack();
        System.out.println("==========================");
        WildDuck wildDuck = new WildDuck();
        wildDuck.display();
        wildDuck.swim();
        wildDuck.fly();
        wildDuck.quack();

    }
}
