package com.ryze.builder.improve;

/**
 * @author ryze
 * @date 2023-05-07 16:35
 */
public class HighBuilder extends HouseBuilder{
    @Override
    public void buildBasic() {
        System.out.println("高层打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("高层砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("高层封顶");
    }

    @Override
    public House build() {
        house.setBasic("20米");
        house.setWall("40cm");
        house.setRoofed("玻璃");
        return house;
    }
}
