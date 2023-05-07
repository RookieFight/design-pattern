package com.ryze.builder.improve;

/**
 * @author ryze
 * @date 2023-05-07 16:26
 * 抽象建造者
 */
public abstract class HouseBuilder {

    //将产品聚合进来
    protected House house = new House();

    /**
     * 打地基
     */
    public abstract void buildBasic();

    /**
     * 砌墙
     */
    public abstract void buildWalls();

    /**
     * 封顶
     */
    public abstract void roofed();

    public abstract House build();
}
