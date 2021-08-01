package com.Berlin.test;

/**
 * @author Berlin
 * @Time 2020/11/3 15:55
 */

/*
    1.final、finally和finalize的区别
        final可以修饰类，不能被继承；
        修饰方法，不能被重写；
        修饰变量，只能赋值一次；

        finally时try语句中的一个语句体，不能单独使用，用来释放资源

        finalize是一个方法，当垃圾回收器确定不存在该对象的更多引用时，由对象的垃圾回收器调用此方法

    2.如果catch语句里有return语句，finally的代码还会执行吗？如果会，是在return前还是return后？
        会执行，
 */
public class Mianshiti {
    public static void main(String[] args) {
        Demo d = new Demo();
        int r = d.method();
        System.out.println(r);
    }
}

class Demo {
    public int method() {
        int x = 10;
        try {
            x = 20;
            System.out.println(1 / 0);
            return x;
        } catch (Exception e) {
            x = 30;
            return x;
        } finally {
            x = 40;
        }
    }
}
