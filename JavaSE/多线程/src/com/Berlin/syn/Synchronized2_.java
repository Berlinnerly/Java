package com.Berlin.syn;

/**
 * @author Berlin
 * @Time 2020/11/9 14:21
 */

/*
    当多线程并发，有多段代码同步执行时，我们希望某一段代码执行的过程中CPU不要切换到其他线程工作，这是就需要同步；
    如果两段代码是同步的，那么同一时间只能执行一段，在一段代码没结束之前，不会执行另一段代码

    同步代码块
        使用synchronized关键字加上一个锁对象来定义一段代码，就叫同步代码块
        多个同步代码块如果使用相同的锁对象，他们就是同步的

 */
public class Synchronized2_ {
    public static void main(String[] args) {
        Printer2 p = new Printer2();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print1();
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                while (true) {
                    p.print2();
                }
            }
        }.start();
    }
}

class Printer2 {
    Demo d = new Demo();
    //非静态的同步方法的锁对象是什么
    //非静态的同步代码块的锁对象是this
    //静态的同步方法的锁对象是该类的字节码对象
    public static synchronized void print1() {             //同步方法，只需要在方法上加synchronized关键字即可
//        synchronized (d) {                       //同步代码块，锁机制,锁对象可以是任意的      不能用匿名对象，因为不是同一个对象
            System.out.println("1111111");
//        }
    }

    public static void print2() {
        synchronized (Printer2.class) {
            System.out.println("222222222");
        }
    }
}

class Demo2 {

}
