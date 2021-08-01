package com.berlin.test;

import java.util.Scanner;

/**
 * @author Berlin
 * date 2020/10/21 10:43
 */

/*
    模拟登录，给三次机会，并提示还有几次机会；
    用户名和密码都是admin
 */


/*
    分析：
        1.模拟登录需要键盘录入，Scanner；
        2.给三次机会，需要循环；
        3.提示有几次，需要判断；
 */

public class Monidenglu {
    public static void main(String[] args) {
        for (int i = 0; i <= 2; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名：");
            String userName = sc.nextLine();
            System.out.println("请输入密码：");
            String password = sc.nextLine();

            //如果是字符串常量和字符串变量比较，通常是常量调用方法，将变量当作参数传递，防止空指针异常；
            if ("admin".equals(userName) && "admin".equals(password)) {
                System.out.println("欢迎" + userName + "登录！");
                break;              //跳出循环；
            } else {
                if (i == 2) {
                    System.out.println("您的错误次数已经用尽，请明天再来！");
                } else {
                    System.out.println("录入错误，您还有" + (2 - i) + "次机会！");
                }
            }
        }
    }
}
