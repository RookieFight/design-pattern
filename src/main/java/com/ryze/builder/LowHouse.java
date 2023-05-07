package com.ryze.builder;

/**
 * 盖平房
 * @date 2023-05-07 15:37
 */
public class LowHouse extends AbstractHouse {
    public void buildBasic() {
        System.out.println("平房打地基");
    }

    public void buildWalls() {
        System.out.println("平房砌墙");
    }

    public void roofed() {
        System.out.println("平房封顶");
    }
}
