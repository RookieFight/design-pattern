package com.ryze.proxy.staticproxy;

/**
 * @author ryze
 * @date 2023/5/9 10:37
 *
 *
 * 静态代理  在使用时需要定义接口或者父类，被代理对象与代理对象共同实现相同接口或者继承相同父类  通过调用代理对象方法使用目标对象方法，并且在代理对象方法中对目标对象方法进行增强
 */
public class Client {
    public static void main(String[] args) {
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(new TeacherDao());
        teacherDaoProxy.teach();
    }
}
