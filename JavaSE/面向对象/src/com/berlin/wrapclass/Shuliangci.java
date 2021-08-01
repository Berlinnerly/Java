package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/23 9:40
 */

/*
    x?              一次或一次也没有
    x* x;           零次到多次
    x+ x;           一次或多次
    x{n} x;         恰好n次
    x{n,} x;        至少n次
    x{n,m} x;       至少n次，但是不超过m次
 */
public class Shuliangci {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
        String regex6 = "[abc]{5,15}";          //出现5-15次
        System.out.println("abcbc".matches(regex6));
        System.out.println("abcbcab".matches(regex6));
        System.out.println("abc".matches(regex6));
    }

    public static void demo5() {
        String regex5 = "[abc]{5,}";            //至少出现5次
        System.out.println("abcbc".matches(regex5));
        System.out.println("abcbcab".matches(regex5));
        System.out.println("abc".matches(regex5));
    }

    public static void demo4() {
        String regex4 = "[abc]{5}";             //正好5次
        System.out.println("abcbc".matches(regex4));
        System.out.println("abcbccc".matches(regex4));
        System.out.println("abc".matches(regex4));
    }

    public static void demo3() {
        String regex3 = "[abc]+";               //一次到多次
        System.out.println("".matches(regex3));
        System.out.println("a".matches(regex3));
        System.out.println("aaaabbbbbbbcccccc".matches(regex3));
    }

    public static void demo2() {
        String regex2 = "[abc]*";                   //零次到多次
        System.out.println("".matches(regex2));
        System.out.println("abc".matches(regex2));
        System.out.println("a".matches(regex2));
    }

    private static void demo1() {
        String regex1 = "[abc]?";               //一次或一次也没有
        System.out.println("a".matches(regex1));
        System.out.println("b".matches(regex1));
        System.out.println("c".matches(regex1));
        System.out.println("d".matches(regex1));
        System.out.println("".matches(regex1));
    }
}
