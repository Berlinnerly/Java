package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 14:08
 */

/*
    yield 礼让线程
 */
public class Yield_ {
    public static void main(String[] args) {
        new MyThread1().start();
        new MyThread1().start();
    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 1;i <= 1000; i++) {
            if (i % 10 == 0) {
                Thread.yield();                 //让出CPU
            }
            System.out.println(getName() + "..." + i);
        }
    }
}
