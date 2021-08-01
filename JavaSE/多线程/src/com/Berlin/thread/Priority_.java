package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 14:14
 */
public class Priority_ {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0;i < 1000; i++) {
                    System.out.println(getName() + "....aaaaaa");
                }
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0;i < 1000; i++) {
                    System.out.println(getName() + "....bb");
                }
            }
        };

//        t1.setPriority(10);         设置最大优先级
//        t2.setPriority(1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
}
