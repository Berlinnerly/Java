package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 13:29
 */

/*


 */
public class CurrentThread_ {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                System.out.println(getName() + ".....aaaaaaaa");
            }
        }.start();


        new Thread(new Runnable() {
            public void run() {
                //Thread.currentThread()获取当前正在执行的线程
                System.out.println(Thread.currentThread().getName() + ".......bb");
            }
        }).start();

        Thread.currentThread().setName("主线程");
         System.out.println(Thread.currentThread().getName());
    }
}
