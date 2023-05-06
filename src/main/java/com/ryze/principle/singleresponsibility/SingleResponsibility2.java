package com.ryze.principle.singleresponsibility;
/**
 * 单一职责原则  案例二
 *
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("轮船");
//        遵守了单一职责原则，但是代码改动较大，直接改进Vehicle类
    }
}

/**
 * 陆地类
 */
class RoadVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle+"在公路运行");
    }
}

/**
 * 天空类
 */
class AirVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle+"在空中运行");
    }
}

/**
 * 水运类
 */
class WaterVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle+"在水中运行");
    }
}
