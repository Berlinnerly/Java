package com.berlin.单例设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 23:34
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Demo d1 = Demo.d;
//        Demo.d = null;
        Demo d2 = Demo.d;
        System.out.println(d1 == d2);

//        Demo d1 = Demo.getInstance();
//        Demo d2 = Demo.getInstance();
//        System.out.println(d1 == d2);

    }
}
