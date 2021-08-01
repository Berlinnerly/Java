package com.berlin.动态代理.案例1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Berlin
 * @date 2021/1/21 22:27
 * @description
 */
public class MyInvocationHandler implements InvocationHandler {
    private Object target;

    public MyInvocationHandler(Object target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("权限校验");
        method.invoke(target, args);
        System.out.println("日志记录");
        return null;
    }
}
