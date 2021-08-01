package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/23 9:03
 */

/*
    .       任何字符
    \d      数字：[0-9]
    \D      非数字：[^0-9]
    \s      空白字符：[ \t\n\x0b\f\r]
    \S      非空白字符：[^\s]
    \w      单词字符：[a-zA-Z_0-9]
    \W      非单词字符：[^\w]
 */
public class YudingyiZifulei {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
//        demo6();
        String regex7 = "\\W";                              //匹配非单词字符
        System.out.println("a".matches(regex7));
        System.out.println("z".matches(regex7));
        System.out.println("_".matches(regex7));
        System.out.println("%".matches(regex7));
    }

    private static void demo6() {
        String regex6 = "\\w";                              //匹配单词字符
        System.out.println("a".matches(regex6));
        System.out.println("z".matches(regex6));
        System.out.println("_".matches(regex6));
        System.out.println("%".matches(regex6));
    }

    private static void demo5() {
        String regex5 = "\\S";                              //匹配非空白字符
        System.out.println(" ".matches(regex5));
        System.out.println("    ".matches(regex5));
        System.out.println("a".matches(regex5));
    }

    private static void demo4() {
        String  regex4 = "\\s";                         //匹配空白字符
        System.out.println(" ".matches(regex4));
        System.out.println("    ".matches(regex4));     //一个tab键
        System.out.println("    ".matches(regex4));     //四个空格
    }

    private static void demo3() {
        String regex3 = "\\D";                  //匹配非数字
        System.out.println("0".matches(regex3));
        System.out.println("9".matches(regex3));
        System.out.println("a".matches(regex3));
    }

    private static void demo2() {
        String regex2 = "\\d";                  //\代表转义字符，如果想表示\d的话，需要\\d
        System.out.println("0".matches(regex2));
        System.out.println("a".matches(regex2));
        System.out.println("9".matches(regex2));
    }

    private static void demo1() {
        String regex1 = "..";                       //一个·表示一个任意字符
        System.out.println("a".matches(regex1));
        System.out.println("ab".matches(regex1));
    }
}
