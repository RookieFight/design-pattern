package com.ryze.proxy.dynamicproxy.cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author ryze
 * @date 2023/5/9 11:13
 *
 * cglib代理  聚合目标类  通过实现MethodInterceptor接口重写intercept方法实现对目标对象方法的增强
 */
public class ProxyFactory implements MethodInterceptor {


    //维护一个目标对象
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 获取代理对象的方法  使用cglib包下的工具类Enhancer创建代理对象
     * @return
     */
    public Object getProxyInstance() {
        //创建工具类
        Enhancer enhancer = new Enhancer();
        //设置父类  父类为目标对象
        enhancer.setSuperclass(target.getClass());
        //设置回调函数
        enhancer.setCallback(this);
        //创建子类  即代理对象
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("cglib动态代理开始");
        method.invoke(target,args);
        System.out.println("cglib动态代理结束");
        return null;
    }
}
