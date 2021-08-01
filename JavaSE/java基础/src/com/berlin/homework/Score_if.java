package com.berlin.homework;

import java.util.Scanner;

/**
 * @Author: Berlin
 * @Time: 2021/4/7 9:38
 * @Description:
 */
public class Score_if {

    public static void main(String[] args) {

        System.out.println("请输入分数：");
        Scanner scanner = new Scanner(System.in);
        int score1 = scanner.nextInt();

        if (score1 > 100 || score1 < 0) {
            System.out.println("对不起，您输入的值超过了范围，请重新输入！");
        } else if (score1 >= 90) {
            System.out.println("A");
        } else if (score1 >= 80) {
            System.out.println("B");
        } else if (score1 >= 70) {
            System.out.println("C");
        } else if (score1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("不及格");
        }
    }
}
