package com.berlin.单例设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 23:34
 * @description
 */

/**
 * 饿汉式
 */
//public class Demo {
//    // 1. 私有构造方法
//    private Demo() {}
//
//    // 2. 创建本类对象
//    private static Demo d = new Demo();
//
//    // 3. 对外提供公共的访问方法
//    public static Demo getInstance() {
//        return d;
//    }
//}

/**
 * 懒汉式
 */
//public class Demo {
//    // 1. 私有构造方法
//    private Demo() {}
//
//    // 2. 声明一个引用
//    private static Demo d;
//
//    // 3.对外提供公共的访问方式
//    public static Demo getInstance() {
//        if (d == null) {
//            d = new Demo();
//        }
//        return d;
//    }
//}

public class Demo {
    // 1. 私有构造方法
    private Demo() {}

    // 2. 声明一个引用
    public static final Demo d = new Demo();
    }
