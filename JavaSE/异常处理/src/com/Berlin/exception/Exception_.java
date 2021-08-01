package com.Berlin.exception;

/**
 * @author Berlin
 * @Time 2020/11/3 13:57
 */

/*
    异常：Java程序在运行过程中出现的错误

    异常体系：
        Throwable
            Error
            Exception
                RuntimeException


    jvm默认是如何处理异常的：
        main函数收到这个问题时，有两种处理方式：
        1.自己将问题处理，然后继续运行；
        2.自己没有针对的处理方式，只有交给调用main函数的jvm来处理
        jvm有一个默认的异常处理机制，就将该异常进行处理
        并将该异常的名称，异常的信息，异常出现的位置打印在了控制台上，同时将程序停止运行
 */
public class Exception_ {
    public static void main(String[] args) {
//        demo1();
        Demo d = new Demo();
        int x = d.div(10,0);
        System.out.println(x);

    }

    private static void demo1() {
        int[] arr = {11,22,33,44,55};
//        arr = null;
        System.out.println(arr[10]);
    }
}

class Demo {
    public int div(int a,int b) {
        return a / b;
    }
}
