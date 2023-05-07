package com.ryze.builder.improve;

/**
 * @author ryze
 * @date 2023-05-07 16:49
 *
 * 建造者模式优化盖房子
 * 将盖房子步骤抽象到抽象建造者中，具体步骤由实现类实现
 * 将产品对象聚合到抽象建造者中，同样在子类中进行属性填充
 * 在指挥者中聚合抽象建造者，实际调用中调用的是具体执行的子类实现
 * 客户端直接调用指挥者方法传入想要建造的房子类型即可完成建造
 */
public class Client {
    public static void main(String[] args) {
//        HighBuilder builder = new HighBuilder();
        LowBuilder builder = new LowBuilder();
        HouseDirector houseDirector = new HouseDirector(builder);
        House house = houseDirector.constructHouse();
        System.out.println("地基深度："+house.getBasic()+"  墙厚："+house.getWall()+"  屋顶材质："+house.getRoofed());
    }
}
