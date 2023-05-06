package com.ryze.principle.singleresponsibility;

/**
 * 单一职责原则  案例一
 */
public class SingleResponsibility1 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("汽车");
        vehicle.run("飞机");
        vehicle.run("轮船");
    }
}
/**
 * 交通工具类
 * 方式一
 * 违反了单一职责原则，轮船和飞机不在公路上运行
 * 解决方法：创建多个工具类
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle+"在公路上运行。。。。。。");
    }
}
