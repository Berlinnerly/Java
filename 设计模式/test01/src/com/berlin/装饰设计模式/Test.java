package com.berlin.装饰设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 23:29
 * @description
 */
public class Test {
    public static void main(String[] args) {
        StudentPlus studentPlus = new StudentPlus(new Student());
        studentPlus.code();
    }
}
