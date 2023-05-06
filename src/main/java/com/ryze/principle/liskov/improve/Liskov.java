package com.ryze.principle.liskov.improve;

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

class Base {

}

class A extends Base {
    public int func1(int num1, int num2) {
        return num2 - num1;
    }
}
/**
 * 继承时重写了错误的方法导致调用出错，使方法与原来的语义相悖
 */
class B extends Base {

    //使用组合的方式
    private A a = new A();

    public int func1(int num1, int num2) {
        return num1 + num2;
    }

    public int func2(int num1, int num2) {
        return func1(num1,num2) + 3;
    }

    public int func3(int num1, int num2) {
        return a.func1(num1,num2);
    }
}
