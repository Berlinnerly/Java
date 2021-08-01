package com.berlin.test;

/**
 * @author Berlin
 * date 2020/10/21 14:52
 */

/*
    把一个字符串的首字母转成大写，其余为小写（只考虑英文大小写字母字符）
 */
public class ZhuanhuanLianxi {
    public static void main(String[] args) {
        String s = "woaiJSDLFJLLAJLajlf";
        //链式编程：只要保证每次调用完方法返回的是对象，就可以继续调用；
        String s2 = s.substring(0,1).toUpperCase().concat(s.substring(1).toLowerCase());
        System.out.println(s2);
    }
}
