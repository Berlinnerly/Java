package com.berlin.PatternMatcher;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Berlin
 * date 2020/10/23 11:51
 */

/*
    Pattern p = Pattern.compile("a*b");
    Matcher m = p.matcher("aaaaaab");
    boolean b = m.matches();
 */
public class PatternMatcher {
    public static void main(String[] args) {
//        demo();
//        需求：把一个字符串中的手机号码获取出来；
        String s = "我的手机号码是：18988888888，曾经用过18987654321，还用过18812345678";
        String regex = "1[3578]\\d{9}";         //手机号码的正则表达式
//        Pattern p = Pattern.compile(regex);
//        Matcher m = p.matcher(s);
//        boolean b = m.matches();
//        System.out.println(b);

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);
//        boolean b1 = m.find();
//        System.out.println(b1);
//        String s1 = m.group();
//        System.out.println(s1);

        while (m.find())
            System.out.println(m.group());
    }

    public static void demo() {
        Pattern p = Pattern.compile("a*b");         //获取到正则表达式
        Matcher m = p.matcher("aaaaab");        //获取匹配器
        boolean b = m.matches();                    //看是否能匹配，匹配就返回true

        System.out.println(b);
        System.out.println("aaaab".matches("a*b"));     //结果一样
    }
}
