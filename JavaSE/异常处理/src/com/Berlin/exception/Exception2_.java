package com.Berlin.exception;

/**
 * @author Berlin
 * @Time 2020/11/3 14:18
 */

/*
    异常处理的两种方式：
        1.try...catch...finally
            try catch
            try catch finally
            try finally
          throws
        2.try...catch处理异常的基本格式
            try...catch...finally

    try:用来检测异常的；
    catch:用来捕获异常的；
    finally:释放资源的

    当通过try...catch将问题处理了，程序可以继续执行

 */
public class Exception2_ {
    public static void main(String[] args) {
        Demo2 d = new Demo2();
        try {
            int x = d.div(10,0);
            System.out.println(x);
        } catch (ArithmeticException a) {
            System.out.println("除数为0");
        }
    }
}

class Demo2 {
    public int div(int a,int b) {
        return a / b;
    }
}
