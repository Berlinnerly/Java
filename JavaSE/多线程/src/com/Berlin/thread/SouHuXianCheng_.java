package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 13:47
 */

/*
        守护线程

 */
public class SouHuXianCheng_ {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(getName() + "........aaaaaaaaaaaaaaa");
                }
            }
        };


        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println(getName() + "........bb");
                }
            }
        };

        t2.setDaemon(true);             //当传入true就设置为守护线程
        t1.start();
        t2.start();
    }
}
