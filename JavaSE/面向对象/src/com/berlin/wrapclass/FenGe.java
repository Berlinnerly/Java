package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/23 9:57
 */

/*
        split();        返回的是一个字符串数组
 */
public class FenGe {
    public static void main(String[] args) {
        String s = "周文轩.胡艳霏.高鑫";        //定义一个字符串，中间有空格
        String regex = "\\.";                     //定义正则表达式
        String[] arr = s.split(regex);          //使用split方法，返回一个字符串数组
        for (int i = 0;i < arr.length;i++) {        //对字符串数组进行遍历
            System.out.println(arr[i]);
        }
    }
}
