package com.ryze.adaptor.objadaptor;


/**
 * @author ryze
 * @date 2023/5/7 20:48
 *
 * 对象适配器：通过持有src对象实例实现dst接口的方式进行适配，不再继承src类，而是采用聚合的方式    最常用的适配器方式
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new ObjAdaptor(new Voltage220()));
    }
}
