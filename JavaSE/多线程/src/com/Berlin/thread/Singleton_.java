package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 15:48
 */

/*

 */
public class Singleton_ {
    public static void main(String[] args) {
        Singleton s1 = Singleton.s;
//        Singleton s1 = Singleton.s;           //成员变量被私有，不能通过类名.调用
//        Singleton s = null;
        Singleton s2 = Singleton.s;

//        System.out.println(s1 == s2);

//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//
        System.out.println(s1 == s2);
    }
}

/*
    饿汉式
 */
//class Singleton {
//    //1.私有构造方法,其他类不能方法该构造方法
//    private Singleton() {}
//    //2.创建本类对象
//    private static Singleton s = new Singleton();
//    //3.对外提供公共的访问方法
//    public static Singleton getInstance() {
//        return s;
//    }
//}

//懒汉式
//class Singleton {
//    //1.私有构造方法,其他类不能方法该构造方法
//    private Singleton() {}
//    //2.创建本类对象
//    private static Singleton s = new Singleton();
//    //3.对外提供公共的访问方法
//    public static Singleton getInstance() {         //获取实例
//        if (s == null) {
//            s = new Singleton();
//        }
//        return s;
//    }
//}

/*
    饿汉式和懒汉式的区别：
        1.饿汉式是空间换时间，懒汉式是时间换空间
        2.在多线程访问时，饿汉式不会创建多个对象，而懒汉式有可能会创建多个对象
 */

class Singleton {
    //1.私有构造方法,其他类不能方法该构造方法
    private Singleton() {}
    //2.声明一个引用
    public static final Singleton s = new Singleton();
    }