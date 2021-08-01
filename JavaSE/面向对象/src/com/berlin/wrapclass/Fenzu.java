package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/23 11:18
 */

/*
    正则表达式的分组功能
    捕获组可以通过从左到右计算其开括号来编号
        例如：在表达式((a)(b(c)))中，存在四个这样的组：
            1.((a)(b(c)))
            2.(a
            3.(b(c))
            4.(c)

 */
public class Fenzu {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        //需求：
            //我我。。。。我。。。我。要。。。要要。。。要学。。。。学学。。学。编。。编编。编。程。程。程。。程
        String s = "我我。。。。我。。。我。要。。。要要。。。要学。。。。学学。。学。编。。编编。编。程。程。程。。程";
        String s2 = s.replaceAll("。","");
        System.out.println(s2);
        String s3 = s2.replaceAll("(.)\\1+","$1");  //$1代表第一组中的内容
        System.out.println(s3);
    }

    public static void demo2() {
        //要求：请按照叠词切割"sdqqfgkkkhippppkl"

        String regex = "(.)\\1+";               //+代表第一组出现一次到多次
        String s = "sdqqfgkkkhippppkl";
        String[] arr = s.split(regex);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void demo1() {
        //叠词：快快乐乐 高高兴兴
        String regex = "(.)\\1(.)\\2";        //\\1代表第一组又出现一次   \\2代表第二组又出现一次
        System.out.println("快快乐乐".matches(regex));

        String regex2 = "(..)\\1";
        System.out.println("死啦死啦".matches(regex2));
    }
}
