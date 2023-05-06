package com.ryze.singleton.type5;

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
 * 懒汉式（同步代码块，线程不安全） 与懒汉式最初版存在相同问题
 */
class Singleton {

    //构造私有化
    private Singleton() {}

    //创建静态成员变量
    private static Singleton instance;

    //提供共有静态方法
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {
                //锁粒度变小  但是多线程并发时不能保证线程安全
                // 当一个线程获取锁进入到代码块时时间片用完切换到下一个线程时，下个线程创建实例后前一个线程又获取到时间片会再次创建对象实例，不能保证单例
                instance = new Singleton();
            }
        }
        return instance;
    }

}
