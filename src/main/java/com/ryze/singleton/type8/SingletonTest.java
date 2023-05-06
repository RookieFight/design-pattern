package com.ryze.singleton.type8;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance1 == instance);
        System.out.println(instance1.hashCode());
        System.out.println(instance.hashCode());

        instance.doSomething();
    }
}

/**
 * 枚举   可以实现单例，避免多线程安全问题，还能避免反序列化重新创建新对象
 */
enum Singleton {
    INSTANCE;
    public void doSomething() {
        System.out.println("输出一段话");
    }
}
