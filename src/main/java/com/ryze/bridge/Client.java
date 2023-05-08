package com.ryze.bridge;

/**
 * @author ryze
 * @date 2023-05-08 8:18
 *
 * 桥接模式：
 */
public class Client {
    public static void main(String[] args) {
        //使用旋转vivo手机
        AroundBrand aroundBrand = new AroundBrand(new Vivo());
        aroundBrand.open();
        aroundBrand.close();
        aroundBrand.call();
    }
}
