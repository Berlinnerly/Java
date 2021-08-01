package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/22 14:33
 */

/*
    Integre类的概述
        通过JDK提供的API，查看Integer的概述
        Integer类在对象中包装了一个基本类型int的值；
        该类提供多个方法，能在int类型和String类型之间转换；
        还提供了处理int类型时非常有用的一些常量和方法；

    构造方法
        public Integer(int value)
        public Integer(String s)
 */
public class Integre_ {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);      //int类型能表示的最大值
        System.out.println(Integer.MIN_VALUE);      //int类型能表示的最小值

        Integer i1 = new Integer(100);
        System.out.println(i1);

        Integer i2 = new Integer("100");
        System.out.println(i2);

        /*
        int --- String
            1.和“”进行拼接；
            2.public static String valueOf(int i);
            3.int -- Integer -- String(Integer类的toString()方法)；
            4.public static String toString(int i);(Integer类的静态方法)；
        String -- int
            1.String -- Integer --int
            2.public static int parseInt(String s)

            基本数据类型有八种，其中七种都有parseXxx的方法，可以将这七种的字符串表现形式转换成基本数据类型
            char的包装类Character中没有parseXxx方法
            字符串到字符的转换通过toCharArray()方法
         */

        //int -- String
        int i = 100;
        String s1 = i + "";             //第一种方法     推荐使用一二种方法
        String s2 = String.valueOf(i);  //第二种方法

        Integer i5 = new Integer(i);    //第三种方法
        String s3 = i2.toString();

        String s4 = Integer.toString(i);    //第四种方法
        System.out.println(s1);

        //String -- int
        String s = "200";
        Integer i4 = new Integer(s);
        System.out.println(i4.intValue());          //将Integer转换成了int数

        int i6 = Integer.parseInt(s);           //静态方法
        System.out.println(i6);
    }
}
