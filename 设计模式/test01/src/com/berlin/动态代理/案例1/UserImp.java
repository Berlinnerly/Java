package com.berlin.动态代理.案例1;

/**
 * @author Berlin
 * @date 2021/1/21 22:23
 * @description
 */
public class UserImp implements User{
    @Override
    public void add() {
        System.out.println("添加功能");
    }

    @Override
    public void delete() {
        System.out.println("删除功能");
    }
}
