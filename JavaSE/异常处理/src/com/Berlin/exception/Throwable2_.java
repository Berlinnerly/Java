package com.Berlin.exception;

/**
 * @author Berlin
 * @Time 2020/11/3 15:28
 */

/*
    throws的方式处理异常
        定义功能方法时，需要把出现的问题暴露出来让调用者去处理；
        那么就通过throws在方法上标识；

    编译时异常的抛出必须对其进行处理
    运行时异常的抛出可以处理也可以不处理

    throws和throw的区别：
        throws：
            用在方法声明后，跟的时异常类名；
            可以跟多个异常类名，用逗号隔开；
            表示抛出异常，由该方法的调用者来处理
        throw：
            用在方法体内，跟的是异常对象名；
            只能抛出一个异常对象名；
            表示抛出类名，由方法体内的语句处理
 */
public class Throwable2_ {
    public static void main(String[] args) throws Exception {
        Person p = new Person();
        p.setAge(17);
        System.out.println(p.getAge());
    }
}

class Person {
    private String name;
    private int age;
    public Person() {}
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeOfBoundsException {
        if (age > 0 && age < 120) {
            this.age = age;
        } else {
//            throw new Exception("年龄非法");
            throw new AgeOfBoundsException("年龄非法");
        }

    }
}
