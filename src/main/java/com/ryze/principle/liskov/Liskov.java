package com.ryze.principle.liskov;

/**
 * 里氏替换原则：所有引用基类的地方都必须能够透明的使用其子类对象，即子类尽量不要重写父类方法
 */
public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("5-3="+a.func1(3,5));
        System.out.println("1-6="+a.func1(6,1));
        System.out.println("-------------------------------");
        B b = new B();
        System.out.println("5-3="+b.func1(3,5));
        System.out.println("1-6="+b.func1(6,1));
        System.out.println("1-6="+b.func2(6,1));
    }
}

class A {
    public int func1(int num1, int num2) {
        return num2 - num1;
    }
}
/**
 * 继承时重写了错误的方法导致调用出错，使方法与原来的语义相悖
 */
class B extends A {
    @Override
    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1,num2) + 3;
    }
}
