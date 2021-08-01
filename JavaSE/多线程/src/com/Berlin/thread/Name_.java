package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 13:17
 */

/*

 */
public class Name_ {
    public static void main(String[] args) {
//        demo1();
        Thread t1 = new  Thread() {
            public void run() {
//                this.setName("zhang");
                System.out.println(this.getName() + "............aaaaaaaaaaaaaaaaaaaaaa");
            }
        };


        Thread t2 = new Thread() {
            public void run() {
//                this.setName("guo");
                System.out.println(this.getName() + "............aaaaaaaaaaaaaaaaaaaaaa");
            }
        };

        t1.setName("zhang");
        t2.setName("guo");

        t1.start();
        t2.start();
    }

    public static void demo1() {
        new Thread("lala") {                                //通过构造方法赋值
            public void run() {
                System.out.println(this.getName() + "......aaaaaa");
            }
        }.start();

        new Thread("xixi") {
            public void run() {
                System.out.println(this.getName() + ".....bb");
            }
        }.start();
    }
}
