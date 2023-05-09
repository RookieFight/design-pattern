package com.ryze.proxy.dynamicproxy.jdk;

/**
 * @author ryze
 * @date 2023/5/9 10:54
 */
public class Client {
    public static void main(String[] args) {
        TeacherDao teacherDao = new TeacherDao();
        ProxyFactory proxyFactory = new ProxyFactory(teacherDao);
        ITeacherDao proxyInstance = (ITeacherDao) proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
