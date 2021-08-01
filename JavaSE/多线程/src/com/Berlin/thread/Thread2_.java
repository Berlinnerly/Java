package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 10:24
 */

/*

 */
public class Thread2_ {
    public static void main(String[] args) {
        MyThread mt = new MyThread();               //4.创建thread类的子类对象
        mt.start();                     //5.开启线程

        for (int i = 0; i < 1000; i++) {
            System.out.println("bbbb");
        }
    }
}

class MyThread extends Thread {         //1.继承thread
    public void run() {                 //2.重写run方法
        for (int i = 0; i < 1000; i++) {        //3.将要执行的代码写道run方法中
            System.out.println("aaaaaaaaaaaa");
        }
    }
}
