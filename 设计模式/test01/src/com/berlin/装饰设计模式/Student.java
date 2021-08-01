package com.berlin.装饰设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 23:22
 * @description
 */
public class Student implements Coder{
    @Override
    public void code() {
        System.out.println("JavaSE");
        System.out.println("JavaWeb");
    }
}
