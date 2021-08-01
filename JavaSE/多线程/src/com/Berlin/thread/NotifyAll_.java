package com.Berlin.thread;

//package com.Berlin.thread;
//
//import com.Berlin.syn.Printer2;
//
///**
// * @author Berlin
// * @Time 2020/11/9 17:20
// */
//public class NotifyAll_ {
//    public static void main(String[] args) {
//        final Printer2 p = new com.Berlin.syn.Printer2();
//        new Thread() {
//            public void run() {
//                while (true) {
//                    try {
//                        p.print1();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }.start();
//
//        new Thread() {
//            public void run() {
//                while (true) {
//                    try {
//                        p.print2();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }.start();
//
//        new Thread() {
//            public void run() {
//                while (true) {
//                    try {
//                        p.print3();
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            }
//        }.start();
//    }
//}
//
//
///*
//
// */
class Printer2 {
    private int flag = 1;

    public void print1() throws InterruptedException {
        synchronized (this) {                       //同步代码块，锁机制,锁对象可以是任意的      不能用匿名对象，因为不是同一个对象
            while (flag != 1) {
                this.wait();
            }
            System.out.println("1111111");
            System.out.println("2222222");
            System.out.println("3333333");
            System.out.println("4444444");
            System.out.println("5555555");
            flag = 2;
//            this.notify();
            this.notifyAll();
        }
    }

    public void print2() throws InterruptedException {
        synchronized (this) {
            while (flag != 2) {
                this.wait();                    //当前线程等待
            }
            System.out.println("6666666");
            System.out.println("7777777");
            System.out.println("8888888");
            System.out.println("9999999");
            System.out.println("0000000");
            flag = 3;
//            this.notify();                      //随即唤醒单个等待的线程
            this.notifyAll();
        }
    }

    public void print3() throws InterruptedException {
        synchronized (this) {
            while (flag != 3) {                 //while循环是循环判断，每次都会判断标记
                this.wait();                    //当前线程等待
            }
            System.out.println("i");
            System.out.println("t");
            System.out.println("h");
            System.out.println("e");
            flag = 1;
//            this.notify();                      //随即唤醒单个等待的线程
            this.notifyAll();
        }
    }
}
