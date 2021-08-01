package com.berlin.homework;

/**
 * @Author: Berlin
 * @Time: 2021/4/6 23:15
 * @Description:
 */
public class Score_ {

    public static void main(String[] args) {

        int sum;
        sum = 0;

        for (int i = 100; i < 1000; i++) {
            if (i % 4 != 0) {
                sum += i;
            }
        }
        System.out.println("100到1000之内不能被四整除的数的和为：" + sum);
    }
}
