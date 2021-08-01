package com.Berlin.动态代理;

/**
 * @author Berlin
 * @Time 2020/11/13 11:31
 */
public class Userimp implements User{

    @Override
    public void add() {
//        System.out.println("权限校验");
        System.out.println("添加功能");
//        System.out.println("日志记录");
    }

    @Override
    public void delete() {
//        System.out.println("权限校验");
        System.out.println("删除功能");
//        System.out.println("日志记录");
    }
}
