package com.Berlin.动态代理;

import java.lang.reflect.Proxy;

/**
 * @author Berlin
 * @Time 2020/11/13 11:32
 */

/*
    动态代理
        在程序运行过程中产生的这个对象，而程序运行过程中产生对象其实就是反射，所以动态代理就是通过反射来生成一个代理

    在Java中java.lang.reflect包下提供了一个proxy类和一个InvocationHandler接口，通过使用这个类和接口就可以生成动态代理对象，jdk提供的代理只能针对接口做代理，
    我们有更加强大的代理cglib, proxy类中的方法创建动态代理对象
 */
public class Test_ {
    public static void main(String[] args) {
//        Userimp ui = new Userimp();
//        ui.add();
//        ui.delete();
//
//        System.out.println("--------------");
//
//        MyInvocationHandler m = new MyInvocationHandler(ui);
//        User u = (User) Proxy.newProxyInstance(ui.getClass().getClassLoader(), ui.getClass().getInterfaces(), m);
//        u.add();
//        u.delete();

        StudentImp si = new StudentImp();
        si.login();
        si.submit();

        System.out.println("------------------------");

        MyInvocationHandler m = new MyInvocationHandler(si);
        Student u = (Student) Proxy.newProxyInstance(si.getClass().getClassLoader(), si.getClass().getInterfaces(), m);

        si.login();
        si.submit();
    }
}
