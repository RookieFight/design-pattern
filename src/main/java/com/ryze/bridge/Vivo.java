package com.ryze.bridge;

/**
 * @author ryze
 * @date 2023-05-08 8:25
 *
 * 具体手机品牌
 */
public class Vivo implements IPhone {
    @Override
    public void open() {
        System.out.println("vivo开机");
    }

    @Override
    public void close() {
        System.out.println("vivo关机");
    }

    @Override
    public void call() {
        System.out.println("vivo打电话");
    }
}
