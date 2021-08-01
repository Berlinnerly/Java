package com.berlin.String;

/**
 * @author Berlin
 * date 2020/10/21 13:53
 */

/*
    String类的转换功能；
    byte[] getBytes():把字符串转换为字节数组；
    char[] toCharArray():把字符串转换为字符数组；
    static String valueOf(char[] chs):把字符数组转换成字符串；
    static String valueOf(int i):把int类型的数据转换成字符串；
    注意：String类的valueOf方法可以把任意类型的数据转换成字符串；

    String toLowerCase():把字符串转成小写；
    String toUpperCase():把字符串转成大写；
    String concat(String str):把字符串拼接；
 */
public class String_zhaunhuan {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
        String s1 = "heiMA";
        String s2 = "chengxuYUAN";
        String s3 = s1.toLowerCase();
        String s4 = s2.toUpperCase();

        System.out.println(s3);
        System.out.println(s4);

        System.out.println(s3 + s4);                //用+拼接字符串更强大，可以用字符串与任意类型相加；
        System.out.println(s3.concat(s4));          //concat方法调用的和传入的都必须是字符串；
    }

    private static void demo3() {
        char[] arr = {'a','b','c'};
        String s = String.valueOf(arr);         //底层是由String类的构造方法完成的；
        System.out.println(s);

        String s2 = String.valueOf(100);        //将100转换为字符串；
        System.out.println(s2);

        Person p1 = new Person("张三",23);
        System.out.println(p1);
        String s3 = String.valueOf(p1);
        System.out.println(s3);
    }

    private static void demo2() {
        String s = "heima";
        char[] arr = s.toCharArray();               //将字符串转换成字符数组；
        for (int i = 0;i < arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    private static void demo1() {
        String str = "abc";
        byte[] arr = str.getBytes();
        for (int i = 0;i < arr.length;i++) {
            System.out.println(arr[i]);
        }

        String str2 = "你好你好";
        byte[] arr2 = str2.getBytes();              //通过GBK码表将字符串转化成字节数组；
        for (int i = 0;i < arr2.length;i++) {       //编码过程，把我们看得懂的转化成计算机看得懂的；
            System.out.println(arr2[i]);            //GBK码表，一个中文代表两个字节；
        }                                           //GBK码表的特点：中文的第一个字节一定是负数；
    }
}
