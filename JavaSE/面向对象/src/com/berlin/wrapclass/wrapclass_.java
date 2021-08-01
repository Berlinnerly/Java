package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/22 14:24
 */

/*
    基本类型包装类
        将基本数据类型封装成对象的好处在于可以在对象中定义更多的功能方法操作该数据；
    常用操作
        基本数据类型与字符串之间的转换；
    基本数据类型和包装类的对应
    byte    Byte
    short   Short
    int     Integer
    long    Long
    float   Float
    double  Double
    boolean Boolean
    char    Character
 */
public class wrapclass_ {
    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(60));         //二进制
        System.out.println(Integer.toOctalString(60));          //八进制
        System.out.println(Integer.toHexString(60));            //十六进制
    }
}
