package com.ryze.singleton.type7;

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
 * 静态内部类，线程安全
 */
class Singleton {

    //构造私有化
    private Singleton() {}

    //创建静态内部类  当外部类加载时，静态内部类不会马上被加载，起到了懒加载的作用，同时静态内部类的加载是线程安全的
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    //提供共有静态方法
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
