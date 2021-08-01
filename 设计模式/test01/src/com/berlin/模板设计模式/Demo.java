package com.berlin.模板设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 22:55
 * @description
 */
public class Demo {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println("x");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        Test test = new Test();
        System.out.println(test.getTime());
    }
}
