package com.ryze.prototype;

import lombok.Data;

/**
 * 原型类
 */
@Data
public class Sheep implements Cloneable {
    String name;
    int age;
    String color;


    public Sheep() {
    }

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }


    /**
     * 当前模式为浅拷贝
     * @return
     */
    @Override
    protected Sheep clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
        return sheep;
    }
}
