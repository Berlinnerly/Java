package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 23:08
 */

/*
    线程组
 */
public class ThreadGroup_ {
    public static void main(String[] args) {
//        demo1();
        ThreadGroup tg = new ThreadGroup("我是一个新的线程组");      //创建新的线程组
        MyRunnable2 mr = new MyRunnable2();                             //创建Runnable的子类对象

        Thread t1 = new Thread(tg, mr, "张三");                   //将线程t1放在组中
        Thread t2 = new Thread(tg, mr, "李四");

        System.out.println(t1.getThreadGroup().getName());              //获取组名
        System.out.println(t2.getThreadGroup().getName());

        tg.setDaemon(true);
    }

    public static void demo1() {
        MyRunnable2 mr = new MyRunnable2();
        Thread t1 = new Thread(mr, "张三");
        Thread t2 = new Thread(mr, "李四");

        ThreadGroup tg1 = t1.getThreadGroup();
        ThreadGroup tg2 = t1.getThreadGroup();

        System.out.println(tg1.getName());          //默认是主线程
        System.out.println(tg2.getName());
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0;i < 1000; i++) {
            System.out.println(Thread.currentThread().getName() + "...." + i);
        }
    }
}
