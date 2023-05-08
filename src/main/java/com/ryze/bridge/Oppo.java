package com.ryze.bridge;

/**
 * @author ryze
 * @date 2023-05-08 8:27
 */
public class Oppo implements IPhone {
    @Override
    public void open() {
        System.out.println("oppo开机");
    }

    @Override
    public void close() {
        System.out.println("oppo关机");
    }

    @Override
    public void call() {
        System.out.println("oppo打电话");
    }
}
