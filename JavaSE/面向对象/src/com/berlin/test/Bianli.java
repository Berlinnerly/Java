package com.berlin.test;

/**
 * @author Berlin
 * date 2020/10/21 13:32
 */

/*
    需求：遍历字符串；
 */
public class Bianli {
    public static void main(String[] args) {
        String s = "heima";
        for (int i = 0;i < s.length();i++) {            //通过for循环获取每个字符的索引
            char c = s.charAt(i);
            System.out.println(c);
            System.out.println(s.charAt(i));            //通过索引获取每个一字符
        }
    }
}
