package com.Berlin.单例设计模式;

/**
 * @Author Berlin
 * @Date 2021/1/13 8:40 星期三
 * @Description
 */
public class Singleton01 {
    public static void main(String[] args) {
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
        Singleton s1 = Singleton.s;
        Singleton s2 = Singleton.s;

        System.out.println(s1 == s2);
    }
}

class Singleton {
    // 私有构造，不能创建对象
    private Singleton() {}

    // 声明一个引用
    public static final Singleton s = new Singleton();

    // 对外提供公共的访问方法
//    public static Singleton getInstance() {
//        if (s == null) {
//            s = new Singleton();
//        }
//        return s;
//    }
}
