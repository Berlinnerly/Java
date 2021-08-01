package com.berlin.test;

/**
 * @author Berlin
 * date 2020/10/21 14:59
 */

/*
    把数组中的数据按照指定格式，拼接成一个字符串；
    int[] arr = {1,2,3};
    输出结果："[1,2,3]"

    分析：
        1.定义一个字符串"["
        2.遍历数组中的每一个元素；
        3.用字符串与数组中的元素拼接；
 */
public class test1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        String s = "[";

        for (int i = 0;i < arr.length;i++) {
            if (i == arr.length - 1) {
                s = s + arr[i] + "]";
            } else {
                s = s + arr[i] + ", ";
            }
        }
        System.out.println(s);
    }
}
