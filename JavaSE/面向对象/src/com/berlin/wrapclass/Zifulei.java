package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/22 17:00
 */

/*
    [abc] a,b或c(简单类)
    [^abc] 任何字符，除了a,b或c(否定)
    [a-zA-Z] a-z或A到Z，两头的字母包括在内（范围）
    [a-d[m-p]] a到d或m到p:[a-dm-p](并集)
    [a-z&&[def]] d,e或f(并集)
    [a-z&&[^bc]] a-z,除了b和c:[ad-z](减去)
    [a-z&&[^m-p]] a-z,而非m-p:[a-lq-z](减去)
 */
public class Zifulei {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
//        demo5();
//        demo6();
        String regex7 = "[a-z&&[^m-p]]";            //在a-z和不是m-p之间取交集；
        System.out.println("a".matches(regex7));
        System.out.println("m".matches(regex7));
        System.out.println("g".matches(regex7));
    }

    private static void demo6() {
        String regex6 = "[a-z&&[^bc]]";             //在a-z和非bc之间取交集；
        System.out.println("a".matches(regex6));
        System.out.println("b".matches(regex6));
        System.out.println("f".matches(regex6));
        System.out.println("c".matches(regex6));
    }

    private static void demo5() {
        String regex5 = "[a-z&&[def]]";                 //在a-z和def之间取交集；
        System.out.println("a".matches(regex5));
        System.out.println("d".matches(regex5));
        System.out.println("c".matches(regex5));
        System.out.println("e".matches(regex5));
    }

    private static void demo4() {
        String regex4 = "[a-d[m-p]]";                   //a-d或m-p
        System.out.println("a".matches(regex4));
        System.out.println("m".matches(regex4));
        System.out.println("n".matches(regex4));
        System.out.println("o".matches(regex4));
        System.out.println("z".matches(regex4));
        System.out.println("t".matches(regex4));
    }

    private static void demo3() {
        String regex3 = "[a-zA-Z]";                         //a-z或A到Z，两头的字母包括在内
        System.out.println("a".matches(regex3));
        System.out.println("A".matches(regex3));
        System.out.println("z".matches(regex3));
        System.out.println("Z".matches(regex3));
        System.out.println("#".matches(regex3));
        System.out.println("1".matches(regex3));
    }

    private static void demo2() {
        String regex2 = "[^abc]]";                        //任何字符，除了a,b,c
        System.out.println("a".matches(regex2));
        System.out.println("b".matches(regex2));
        System.out.println("c".matches(regex2));
        System.out.println("d".matches(regex2));
        System.out.println("$".matches(regex2));
        System.out.println("10".matches(regex2));        //10代表1和0两个字符，不是单个字符；
    }

    private static void demo1() {
        String regex1 = "[abc]";                         //[]代表单个字符
        System.out.println("a".matches(regex1));
        System.out.println("b".matches(regex1));
        System.out.println("c".matches(regex1));
        System.out.println("d".matches(regex1));
        System.out.println("%".matches(regex1));
        System.out.println("10".matches(regex1));
    }
}
