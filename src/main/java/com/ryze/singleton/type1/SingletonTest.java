package com.ryze.singleton.type1;

public class SingletonTest {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance == instance1);
    }
}

/**
 * 饿汉式（静态变量）   写法简单，但是在类加载的时候就已经实例化，如果一直没有被调用容易造成内存资源浪费
 */
class Singleton {
    //构造器私有化,防止外部创建
    private Singleton() {}

    //内部创建实例
    private final static Singleton instance = new Singleton();

    //对外提供公有静态方法获取对象实例
    public static Singleton getInstance() {
        return instance;
    }
}
