package com.ryze.principle.segregation;

/**
 * 接口隔离原则：一个类通过接口去依赖另一个类时，针对于接口中使用不到的方法应该进行隔离，以最小接口对接，即将大接口拆分为多个小接口
 */
public class Segregation1 {
    public static void main(String[] args) {

    }
}

interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("B实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("B实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("B实现了operation5");
    }
}

class D implements Interface1 {

    @Override
    public void operation1() {
        System.out.println("D实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("D实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("D实现了operation3");
    }

    @Override
    public void operation4() {
        System.out.println("D实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D实现了operation5");
    }
}

class A {//A类通过接口Interface1 依赖B类1、2、3方法
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }

    public void depend2(Interface1 interface1) {
        interface1.operation2();
    }

    public void depend3(Interface1 interface1) {
        interface1.operation3();
    }
}

class C {//C类通过接口Interface1 依赖D类1、4、5方法
    public void depend1(Interface1 interface1) {
        interface1.operation1();
    }
    public void depend4(Interface1 interface1) {
        interface1.operation4();
    }
    public void depend5(Interface1 interface1) {
        interface1.operation5();
    }
}