package com.ryze.strategy;

/**
 * @author ryze
 * @date 2023-05-08 10:09
 *
 * 鸭子抽象类  相同特征在基类实现 不同特征在在子类实现  聚合行为接口
 */
public abstract class Duck {

    //聚合不同抽象行为  具体行为在子类构造器中加载
    FlyBehavor flyBehavor;
    QuackBehavor quackBehavor;

    public Duck() {
    }

    protected abstract void display();

    /**
     * 相同特征抽象类中实现  子类不需要重写
     */
    protected void swim() {
        System.out.println("会游泳");
    }

    /**
     * 不同特征使用抽象行为方法  在子类构造器中注入实现类  子类调用具体实现类方法
     */
    protected void fly() {
        if (flyBehavor != null) {
            flyBehavor.fly();
        }
    }
    protected void quack() {
        if (quackBehavor != null) {
            quackBehavor.quack();
        }
    }

}
