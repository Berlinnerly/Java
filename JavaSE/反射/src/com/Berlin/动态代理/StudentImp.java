package com.Berlin.动态代理;

/**
 * @author Berlin
 * @Time 2020/11/13 13:06
 */
public class StudentImp implements Student{
    @Override
    public void login() {
        System.out.println("登录");
    }

    @Override
    public void submit() {
        System.out.println("提交");
    }
}
