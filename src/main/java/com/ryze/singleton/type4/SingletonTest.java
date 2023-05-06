package com.ryze.singleton.type4;

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
 * 懒汉式（同步方法，线程安全） 解决线程安全问题
 */
class Singleton {

    //构造私有化
    private Singleton() {}

    //创建静态成员变量
    private static Singleton instance;

    //提供共有静态方法   加入synchronized关键字  使多线程情况下同一时间只有一个线程能够调用该方法  但是锁粒度太大，效率偏低
    public static synchronized Singleton getInstance() {
        if (null == instance) {
            instance = new Singleton();
        }
        return instance;
    }

}
