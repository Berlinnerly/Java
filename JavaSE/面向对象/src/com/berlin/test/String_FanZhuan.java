package com.berlin.test;

import java.util.Scanner;
/**
 * @author Berlin
 * date 2020/10/21 15:34
 */

/*
    需求：把字符串反转
    键盘录入“abc”,
    输出结果："cba";

    分析：
        将字符串转换成字符数组；
        倒着遍历字符数组；
        再次拼接成字符串；
        打印；
 */

public class String_FanZhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String line = sc.nextLine();

        char[] arr = line.toCharArray();            //将字符串转换成字符数组

        String s = "";
        for (int i = arr.length - 1;i >= 0;i--) {       //倒着遍历字符数组
            s = s + arr[i];                             //拼接成字符串；
        }
        System.out.println(s);
    }
}
