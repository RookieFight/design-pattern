package com.ryze.builder.improve;

/**
 * @author ryze
 * @date 2023-05-07 16:27
 */
public class LowBuilder extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("平房打地基");
    }

    @Override
    public void buildWalls() {
        System.out.println("平房砌墙");
    }

    @Override
    public void roofed() {
        System.out.println("平房封顶");
    }

    @Override
    public House build() {
        house.setBasic("5米");
        house.setWall("20cm");
        house.setRoofed("瓦片");
        return house;
    }
}
