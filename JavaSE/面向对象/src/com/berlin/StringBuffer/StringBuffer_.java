package com.berlin.StringBuffer;

/**
 * @author Berlin
 * date 2020/10/21 16:21
 */

/*
    StringBuffer(字符串缓冲区 )
    StringBuffer和StringBuilder的区别
        StringBuffer是jdk1.0版本的，是线程安全的，效率低；
        StringBuilder是jdk1.5版本的，是线程不安全的，效率高；
    String,StringBuffer和StringBuilder的区别
        String是一个不可变的字符序列；
        StringBuffer和StringBuilder是可变的字符序列；
 */

/*
    1.形式参数问题
        1.String作为参数；
        StringBuffer作为参数传递；
    2.String和String Buffer分别作为参数传递；

    基本数据类型的值传递，不改变其值；
    引用数据类型的值传递，改变其值；

    String类虽然是引用数据类型，但是当她作为参数传递时，和基本数据类型是一样的；
 */
public class StringBuffer_ {
    public static void main(String[] args) {
        String s = "heima";
        System.out.println(s);
        change(s);
        System.out.println(s);

        StringBuffer sb = new StringBuffer();
        sb.append("heima");
        System.out.println(sb);
        change(sb);
        System.out.println(sb);
    }

    public static void change(StringBuffer sb) {
        sb.append("itcast");
    }

    public static void change(String s) {
        s += "itcast";
    }
}
