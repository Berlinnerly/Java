package com.berlin.random;

import java.util.Random;

/**
 * @author Berlin
 * date 2020/10/23 14:00
 */

/*
    java.util.Random
 */
public class random_ {
    public static void main(String[] args) {
        Random r = new Random();

//        int x = r.nextInt();
//        System.out.println(x);

        for (int i = 0; i < 10; i++) {
//            System.out.println(r.nextInt());
            System.out.println(r.nextInt(100));         //取值范围为0-99，生成0到n-1之间的随机数
        }

//        Random r2 = new Random(12);
//        int a = r2.nextInt();
//        int b = r2.nextInt();
    }
}
