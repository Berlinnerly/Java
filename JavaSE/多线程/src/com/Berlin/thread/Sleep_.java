package com.Berlin.thread;



/**
 * @author Berlin
 * @Time 2020/11/9 13:38
 */

public class Sleep_ {
    public static void main(String[] args) throws InterruptedException {
//        demo1();
        new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "......aaaaaaaaaaaa");
                }
            }
        }.start();

        new Thread() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + "......bb");
                }
            }
        }.start();
    }

    public static void demo1() throws InterruptedException {
        for (int i = 20;i >= 0; i--) {
            Thread.sleep(1000);
            System.out.println("倒计时第" + i + "秒");
        }
    }
}
