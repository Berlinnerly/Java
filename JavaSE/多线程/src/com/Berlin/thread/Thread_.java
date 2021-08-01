package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 10:03
 */

/*
    1.什么是线程
        线程是程序执行的路径，一个进程可以包含多个进程；
        多线程并发执行可以提高程序的效率；可以同时完成多项任务；
    2.应用场景
        QQ多人视频
        共享屏幕给多个电脑
        迅雷开启多线程下载
        服务器同时处理多个客户端的请求
    3.并行和并发
        并行就是两个任务同时进行（需要多核CPU）
        并发是指两个任务都请求运行，而处理器只能接受一个任务，就把这两个任务安排轮流进行，由于时间间隔较短，使人感觉在同时运行；
    4.Java程序运行原理和jvm的启动是多线程的吗？
        Java程序运行原理
            Java命令会启动Java虚拟机，启动jvm，等于启动了一个应用程序，也就是启动了一个进程，该进程会自动启用一个主线程，然后主线程会去调用main方法
        jvm的启动是多线程的吗
            jvm至少启动了垃圾回收线程和主线程，所以是多线程
 */

//证明jvm是多线程的
public class Thread_ {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            new Demo();
        }

        for (int i = 0; i < 100000; i++) {
            System.out.println("我是主线程的执行代码");
        }
    }
}

class Demo {
    @Override
    public void finalize() {
        System.out.println("垃圾被清理了");
    }
}
