package com.berlin.String;

/**
 * @author Berlin
 * date 2020/10/20 16:04
 */

import java.util.Scanner;

/*
    Scanner             java.util.Scanner
        一个使用正则表达式解析基本类型和字符串的简单文件扫描器
    hasNextXxx()        判断是否还有下一个输入项，其中XXX可能是int，double等。如果需要判断是否包含下一个字符串，可以省略XXX
    nextXxx()           获取下一个输入项。XXX的含义和上个方法中的XXX相同，默认情况下，Scanner使用空格，回车等作为分隔符

    public int nextInt():获取一个int类型的值；
    public String nextLine():获取一个String类型的值；
 */
public class scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                 //创建键盘录入对象
//        System.out.println("请输入一个int类型的数：");
//        if (sc.hasNextInt()) {                              //判断录入的值是不是int类型
//            int i = sc.nextInt();
//            System.out.println("您输入的数字为：" + i);
//        }else {
//            System.out.println("对不起，您输入的不是一个int类型的数！");
//        }
        System.out.println("请输入一个字符串：");
        String s = sc.nextLine();
        System.out.println(s);
    }
}
