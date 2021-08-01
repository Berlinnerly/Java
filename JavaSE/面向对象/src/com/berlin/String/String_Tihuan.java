package com.berlin.String;

/**
 * @author Berlin
 * date 2020/10/21 15:10
 */

/*
    String的替换功能；
        String replace(char old,char new)
        String replace(String old,String new)
    去除字符串两端空格
        String trim();
    按字典顺序比较两个字符串；
        int compareTo(String str)
        int compareToIgnoreCase(String str)
 */
public class String_Tihuan {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        String s1 = "abc";
        String s2 = "bcd";
        int num = s1.compareTo(s2);         //按照码表值进行比较；
        System.out.println(num);

        String s3 = "黑";
        String s4 = "马";
        int num1 = s3.compareTo(s4);
//        System.out.println('黑' + 0);        //查找的是unicode码表；
//        System.out.println('马' + 0);
        System.out.println(num1);

        String s5 = "heima";
        String s6 = "HEIMA";
        int num3 = s5.compareToIgnoreCase(s6);      //不区分大小写
        System.out.println(num3);
    }

    private static void demo2() {
        String s = "   hei   ma   ";
        String s2 = s.trim();
        System.out.println(s2);
    }

    private static void demo1() {
        String s = "heima";
        String s2 = s.replace('i','o');
        System.out.println(s2);

        String s4 = s.replace('x','i');         //x不存在，保留原字符不变；
        System.out.println(s4);

        String s3 = s.replace("hei","bai");
        System.out.println(s3);
    }
}
