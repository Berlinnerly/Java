package com.Berlin.exception;

/**
 * @author Berlin
 * @Time 2020/11/3 15:13
 */

/*
    Throwable常见的方法：
        getMessage()        获取异常信息，返回字符串；
        toString()          获取异常类名和异常信息，返回字符串；
        printStackTrace()   获取异常类名和异常信息，以及异常出现在程序中的位置，返回值void
 */
public class Throwable_ {
    public static void main(String[] args) {
        try {
            System.out.println(1 / 0);
        } catch (Exception e) {
//            System.out.println(e.getMessage());         //获取异常信息
//            System.out.println(e);                      //调用toString方法，打印异常类名和信息
            e.printStackTrace();                        //jvm默认就用这种方式处理异常
        }
    }
}
