package com.berlin.装饰设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 23:25
 * @description
 */
public class StudentPlus implements Coder{
    // 获取被装饰类的引用
    private Student s;

    // 在构造方法中传入被装饰类的对象
    public StudentPlus(Student s) {
        this.s = s;
    }

    public StudentPlus() {

    }

    // 对原有的功能进行升级
    @Override
    public void code() {
        s.code();
        System.out.println("Spring");
        System.out.println("Spring MVC");
        System.out.println("Spring Boot");
    }
}
