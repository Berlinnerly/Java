package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/23 11:10
 */

/*
    正则表达式的替换功能
    String类的功能：public static replaceAll(Sring regex,String replacement)
 */
public class Tihuan {
    public static void main(String[] args) {
        String s = "wo1ai2heima";
        String regex = "\\d";       //\\d代表的是所有数字

        String s2 = s.replaceAll(regex,"");
        System.out.println(s2);
    }
}
