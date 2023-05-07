package com.ryze.builder;

/**
 * 传统方式实现盖房子
 * @date 2023-05-07 15:34
 */
public abstract class AbstractHouse {

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

    public void build() {
        buildBasic();
        buildWalls();
        roofed();
    }
}
