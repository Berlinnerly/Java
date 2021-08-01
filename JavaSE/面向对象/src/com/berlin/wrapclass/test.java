package com.berlin.wrapclass;

import java.util.Arrays;

/**
 * @author Berlin
 * date 2020/10/23 10:05
 */
/*
    有如下字符串：“91 27 46 38 50”
    请写代码最终实现输出结果是“27 38 46 50 91”

    分析：
        1.将字符串切割成字符串数组
        2.将字符串转换成数字并将其存储在一个等长度的int数组中
        3.排序
        4.将排序后的结果遍历并拼接成一个字符串
 */
public class test {
    public static void main(String[] args) {
        String s = "91 27 46 38 50";
        //1.将字符串切割成字符串数组
        String[] sarr = s.split(" ");
        //2.将字符串转换成数字并将其存储在一个等长度的int数组中
        int[] arr = new int[sarr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sarr[i]);     //将数字字符串转换成数字
        }
        //3.排序
        Arrays.sort(arr);
        //4.将排序后的结果遍历并拼接成一个字符串
        String str = "";
        for (int i = 0; i < arr.length; i++) {
           if (i == arr.length - 1) {
                str = str + arr[i];
           } else {
               str = str + arr[i] + " ";
           }
        }
        System.out.println(str);
    }
}
