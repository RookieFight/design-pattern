package com.ryze.builder.improve;

/**
 * @author ryze
 * @date 2023-05-07 16:37
 * 指挥角色
 */
public class HouseDirector {

    //聚合抽象建造者
    HouseBuilder houseBuilder = null;

    //通过构造器初始化houseBuilder
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //也可以通过setter方法初始化houseBuilder
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    //建造房子的过程交给指挥者,建造好会返回产品实例
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWalls();
        houseBuilder.roofed();
        return houseBuilder.build();
    }
}
