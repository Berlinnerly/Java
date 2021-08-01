package com.berlin.String;

/**
 * @author Berlin
 * date 2020/10/21 10:01
 */
public class String_Panduangongneng {
    public static void main(String[] args) {
        /*
        boolean equals(Object obj):比较字符串中的内容是否相同，区分大小写；
        boolean equalsIgnoreCase(String str):比较字符串中的内容是否相同，忽略大小写;
        boolean contains(String str):判断大写字符串是否包含小字符串；
        boolean stratsWith(String str):判断字符串是否以某个指定的字符串开头；
        boolean endsWith(String str):判断字符串是否以某个指定的字符串结尾；
        boolean isEmpty():判断字符串是否为空；
        “”和null的区别：
            “”是一个字符串常量，同时也是一个String类的对象，可以调用String类中的方法；
            null是空常量，不能调用任何方法，否则会出现空指针异常，null常量可以给任意的引用数据类型赋值；
         */

        String s1 = "heima";
        String s2 = "heima";
        String s3 = "HeiMa";

        System.out.println(s1.equals(s2));          //true
        System.out.println(s2.equals(s3));          //false

        System.out.println("---------------------------");

        System.out.println(s1.equalsIgnoreCase(s2));    //区分大小写
        System.out.println(s1.equalsIgnoreCase(s3));    //不区分大小写
    }

    public static void demo() {
        String s1 = "我爱heima,哈哈";
        String s2 = "heima";
        String s3 = "baima";
        String s4 = "我爱";
        String s5 = "哈哈";

        System.out.println(s1.contains(s2));        //判断是否包含传入的字符串
        System.out.println(s1.contains(s3));

        System.out.println("------------------");

        System.out.println(s1.startsWith(s4));      //true   判断是否包含传入的字符串开头
        System.out.println(s1.endsWith(s5));        //true   判断是否包含传入的字符串结尾
    }

    public static void demo2() {
        String s1 = "heima";
        String s2 = "";
        String s3 = null;

        System.out.println(s1.isEmpty());       //false  判断字符串是否为空
        System.out.println(s2.isEmpty());       //true
//        System.out.println(s3.isEmpty());       //NullPointerException错误

    }
}
