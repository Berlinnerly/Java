package com.berlin.动态代理.案例1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Berlin
 * @date 2021/1/21 22:35
 * @description
 */
public class Test {
    public static void main(String[] args) {
        UserImp userImp = new UserImp();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(userImp);
        User u = (User) Proxy.newProxyInstance(userImp.getClass().getClassLoader(), userImp.getClass().getInterfaces(), myInvocationHandler);
        u.add();
        u.delete();
    }
}
