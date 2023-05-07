package com.ryze.builder;

/**
 *
 * @date 2023-05-07 15:39
 */
public class HighBuilding extends AbstractHouse{
    public void buildBasic() {
        System.out.println("高层打地基");
    }

    public void buildWalls() {
        System.out.println("高层砌墙");
    }

    public void roofed() {
        System.out.println("高层封顶");
    }
}
