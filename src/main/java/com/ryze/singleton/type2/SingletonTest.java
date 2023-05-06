package com.ryze.singleton.type2;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 饿汉式（静态代码块）
 */
class Singleton {
    //构造器私有化,防止外部创建
    private Singleton() {}

    //内部创建实例
    private static Singleton instance;

    static {
        //在静态代码块中实例化
        instance = new Singleton();
    }

    //对外提供公有静态方法获取对象实例
    public static Singleton getInstance() {
        return instance;
    }
}
