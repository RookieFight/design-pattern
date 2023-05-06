package com.ryze.singleton.type3;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());
    }
}

/**
 * 懒汉式（线程不安全） 懒加载，在不被调用时不创建对象实例 多线程操作时可能会有多个线程创建对象实例
 */
class Singleton {

    //构造私有化
    private Singleton() {}

    //创建静态成员变量
    private static Singleton instance;

    //提供共有静态方法
    public static Singleton getInstance() {
        if (null == instance) {//在这里进行线程切换时会出错
            instance = new Singleton();
        }
        return instance;
    }

}
