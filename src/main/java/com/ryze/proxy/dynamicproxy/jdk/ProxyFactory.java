package com.ryze.proxy.dynamicproxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ryze
 * @date 2023/5/9 10:44
 *
 * jdk动态代理  代理类不需要实现接口  通过聚合目标对象  调用Proxy.newProxyInstance对目标对象进行增强  在invoke方法中增加逻辑处理  从而使代理对象调用目标对象方法时起到增强作用
 *
 */public class ProxyFactory {

     //维护一个目标对象
     private Object target;

     //对目标对象进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("jdk动态代理开始");
                //通过反射调用目标方法，method其实就是target.getClass().getInterfaces()
                method.invoke(target,args);
                System.out.println("jdk动态代理结束");
                return null;
            }
        });
    }
}
