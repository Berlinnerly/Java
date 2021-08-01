package com.berlin.动态代理.案例2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Berlin
 * @date 2021/1/22 10:01
 * @description
 */
public class ProxyUtils {
    private MathImp mathImp;

    public ProxyUtils(MathImp mathImp) {
        this.mathImp = mathImp;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), mathImp.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("前");
                Object result = method.invoke(mathImp, args);
                System.out.println(result);
                System.out.println("后");
                return result;
            }
        });
    }
}
