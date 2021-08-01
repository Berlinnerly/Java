package com.berlin.String;

/**
 * @author Berlin
 * date 2020/10/20 16:54
 */

/*
    String          java.lang
        字符串字面值“abc”也可以看成是一个字符串对象；
        字符串是常量，一旦被赋值，就不能被更改
 */
public class String_<demo4> {
    public static void main(String[] args) {
        String s1 = "abc";                          //常量池中没有这个字符串对象就创建一个，如果有直接用即可；
        String s2 = "abc";
        System.out.println(s1 == s2);               //true
        System.out.println(s1.equals(s2));          //true
    }

    public static void demo1() {
        String s1 = "abc";          //创建了两个对象，一个在常量池中，一个在堆内存中
    }

    public static void demo2() {
        String s1 = "abc";       //记录的是堆内存中的地址值
        String s2 = "abc";                          //记录的是常量池中的地址值
        System.out.println(s1 == s2);               //flase
        System.out.println(s1.equals(s2));          //true
    }

    public static void demo3() {
        byte c = 3 + 4;                              //在编译时就变成了7，把7赋值给b，常量优化机制
        String s1 = "a" + "b" + "c";
        String s2 = "abc";
        System.out.println(s1 == s2);               //true,java中有常量优化机制
        System.out.println(s1.equals(s2));          //true
    }

    public static void demo4() {
        String s1 = "ab";
        String s2 = "abc";
        String s3 = s1 + "c";
        System.out.println(s2 == s3);               //false
        System.out.println(s2.equals(s3));          //true
    }
}


