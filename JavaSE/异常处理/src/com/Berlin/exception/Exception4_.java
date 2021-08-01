package com.Berlin.exception;

import java.io.FileInputStream;

/**
 * @author Berlin
 * @Time 2020/11/3 14:54
 */

/*
    编译期异常和运行时异常的区别：
        Java中的异常被分为两大类：编译期异常和运行时异常；
        所有的RuntimeException类及其子类的实例被称为运行时异常，其他的异常就是编译时异常；

        编译时异常：
            Java程序必须显示处理，否则程序就会发生错误，无法通过编译
        运行时异常：
            无需显示处理，也可以和编译时异常一样处理
 */
public class Exception4_ {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("xxx.txt");
        } catch (Exception e) {
            System.out.println("出错了");
        }
    }
}
