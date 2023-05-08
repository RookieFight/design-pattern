package com.ryze.adaptor.classadaptor;

/**
 * @author ryze
 * @date 2023/5/7 20:39
 *
 *
 * 类适配器模式：由于单继承机制，类适配器需要继承src类，所以dst必须是接口，产生一定的局限性，同时由于继承，src中的方法也会在Adaptor中暴露出来，增加了使用成本，但重写src方法也带来了一定的灵活性
 */
public class Client {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new ClassAdaptor());
    }
}
