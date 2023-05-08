package com.ryze.bridge;

/**
 * @author ryze
 * @date 2023-05-08 8:23
 *
 * 样式抽象类  起到桥接作用
 */
public abstract class Brand {

    //聚合手机接口
    IPhone phone;

    //构造器初始化属性
    public Brand(IPhone phone) {
        this.phone = phone;
    }

    protected void open() {
        phone.open();
    }
    protected void close() {
        phone.close();
    }
    protected void call() {
        phone.call();
    }
}
