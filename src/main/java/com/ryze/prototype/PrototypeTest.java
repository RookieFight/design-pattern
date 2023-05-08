package com.ryze.prototype;


public class PrototypeTest {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("aaa",2,"蓝色");
        Sheep sheep1 = sheep.clone();
        System.out.println(sheep.hashCode());
        System.out.println(sheep1.hashCode());
        System.out.println(sheep);
        System.out.println(sheep);
    }
}
