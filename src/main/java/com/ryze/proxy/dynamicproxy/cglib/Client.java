package com.ryze.proxy.dynamicproxy.cglib;

/**
 * @author ryze
 * @date 2023/5/9 13:02
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        TeacherDao teacherDao = new TeacherDao();
        //创建代理类工具类
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        //获取代理类对象
        TeacherDao proxyInstance = (TeacherDao) proxyFactory.getProxyInstance();
        //通过代理类对象调用目标类方法时会触发intercept方法对目标方法进行拦截并进行增强
        proxyInstance.teach();
    }
}
