package com.ryze.principle.singleresponsibility;
/**
 * 单一职责原则  案例三
 *
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {
        NewVehicle newVehicle = new NewVehicle();
        newVehicle.runRoad("摩托车");
        newVehicle.runAir("飞机");
        newVehicle.runWater("轮船");
    }
}

/**
 * 方式三
 * 没有在原来的类上做大的修改，而是扩展了方法
 * 这种方式虽然没有在类上遵守单一职责原则，但是在方法上遵守了单一职责原则
 */
class NewVehicle{
    public void runRoad(String vehicle) {
        System.out.println(vehicle+"在公路上运行。。。。。。");
    }

    public void runAir(String vehicle) {
        System.out.println(vehicle+"在天空上运行。。。。。。");
    }

    public void runWater(String vehicle) {
        System.out.println(vehicle+"在水上运行。。。。。。");
    }
}
