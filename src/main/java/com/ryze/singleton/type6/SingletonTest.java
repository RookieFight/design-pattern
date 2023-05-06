package com.ryze.singleton.type6;

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
 * 懒汉式（双重校验，线程安全）
 */
class Singleton {

    //构造私有化
    private Singleton() {}

    //创建静态成员变量  使用volatile修饰，保证线程间可见同时防止指令重排序
    private static volatile Singleton instance;

    //提供共有静态方法
    public static Singleton getInstance() {
        if (null == instance) {
            synchronized (Singleton.class) {//锁粒度变小
                if (null == instance) {
                    //再次判断实例对象是否创建
                    // 是为了防止线程切换时，当一个线程进入到同步代码块后还没有创建实例就被停止，
                    // 下一个线程创建了对象实例后，上一个线程再次进入时又创建实例的情况发生
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
