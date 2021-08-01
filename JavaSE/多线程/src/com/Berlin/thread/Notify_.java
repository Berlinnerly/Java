package com.Berlin.thread;


/**
 * @author Berlin
 * @Time 2020/11/9 17:01
 */

/*
    等待唤醒机制
 */
public class Notify_ {
    public static void main(String[] args) {
        final Printer p = new Printer();

        new Thread() {
            public void run() {
                while (true) {
                    try {
                        p.print1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                while (true) {
                    try {
                        p.print2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

//等待唤醒机制
class Printer {
    private int flag = 1;
    public void print1() throws InterruptedException {
        synchronized (this) {                       //同步代码块，锁机制,锁对象可以是任意的      不能用匿名对象，因为不是同一个对象
            if (flag != 1) {
                this.wait();
            }
            System.out.println("1111111");
            System.out.println("2222222");
            System.out.println("3333333");
            System.out.println("4444444");
            System.out.println("5555555");
            flag = 2;
            this.notify();
        }
    }

    public void print2() throws InterruptedException {
        synchronized (this) {
            if (flag != 2) {
                this.wait();                    //当前线程等待
            }
            System.out.println("6666666");
            System.out.println("7777777");
            System.out.println("8888888");
            System.out.println("9999999");
            System.out.println("0000000");
            flag = 1;
            this.notify();                      //随即唤醒单个等待的线程
        }
    }
}