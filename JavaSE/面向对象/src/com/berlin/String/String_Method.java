package com.berlin.String;

/**
 * @author Berlin
 * date 2020/10/21 11:12
 */

/*
    int length():获取字符串的长度；
    char charAt(int index):获取指定索引的字符；
    int indexOf(int ch):返回指定字符在此字符串中第一次出现的索引；
    int indexOf(String str):返回指定字符串在此字符串中第一次出现的索引；
    int indexOf(int ch,int fromIndex):返回指定字符在此字符串中从指定位置后第一次出现处的索引；
    int indexOf(String str,int fromIndex):返回指定字符串在此字符串中从指定位置后第一次出现处的索引；
    lastIndexOf
    String substring(int start):从指定位置开始截取字符串，默认到末尾；
    String substring(int start，int end):从指定位置开始到指定位置结束截取字符串；
 */

public class String_Method {
    public static void main(String[] args) {
//        demo();
//        demo1();
//        demo3();
//        demo4();
        String s = "woaiheima";
        s.substring(4);                             //substring会产生一个新的字符串，需要将新的字符串记录；
        System.out.println(s);
    }

    private static void demo4() {
        String s1 = "heimawudi";
        System.out.println(s1.substring(5));           //截取从索引5到末尾
        System.out.println(s1.substring(0, 5));          //包含头，不包含尾，左闭又开
    }

    private static void demo3() {
        String s1 = "woaiheima";
        System.out.println(s1.indexOf('a', 3));      //从指定位置查找；
        System.out.println(s1.lastIndexOf('a'));                //从后向前找，第一次出现的字符；
        System.out.println(s1.lastIndexOf('a', 7));      //从指定位置向前找；
    }

    private static void demo1() {
        String s1 = "heima";
        int index = s1.indexOf('a');        //参数接收的是int类型的，传递char类型会自动类型提升；
        System.out.println(index);

        int index2 = s1.indexOf('z');
        System.out.println(index2);             //如果不存在，返回-1；

        int index3 = s1.indexOf("ma");
        System.out.println(index3);             //获取字符串中第一个字符出现的位置；
    }

    private static void demo() {
//        int[] arr = {11,22,33};
//        System.out.println(arr.length);           //数组中的length是属性
        String s1 = "heima";
        System.out.println(s1.length());            //length（）是一个方法，获取的是每一个字符的个数

        String s2 = "指定，位置？";
        System.out.println(s2.length());
        System.out.println(s2.charAt(2));           //根据索引获取指定位置的字符
        System.out.println(s2.charAt(10));          //字符串的索引越界异常
    }
}
