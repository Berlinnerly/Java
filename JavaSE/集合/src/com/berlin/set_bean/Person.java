package com.berlin.set_bean;

import java.util.Objects;

/**
 * @author Berlin
 * @Time 2020/10/29 9:08
 */

/*
    将自定义类的对象存入Hash Set中去重
        1.类中必须重写hashset()和equals()方法；
        2.hasecode():属性相同的对象返回值必须相同，属性不同的返回值尽量不同（提高效率）
        3.equals()属性相同返回true，属性不同返回false，返回false的时候存储
 */
public class Person {
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

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person [name = " + name + ", age = " + age + "]";
    }

    /*
        健壮性判断
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;             //调用的对象跟传入的对象是同一个对象,直接返回true
        if (o == null) return false;            //传入的对象为null，返回false
        if (getClass() != o.getClass()) return false;   //判断两个对象对应的字节码文件是否是同一个字节码，如果不是，直接返回false
        Person other = (Person) o;                  //向下转型
        if (age != other.age) return false;     //调用对象的年龄不等于传入对象的年龄，返回false
        //调用对象的姓名不等于传入对象的姓名
        if (name == null) {                     //调用对象的姓名为null，
            //传入对象的姓名不为null，
            return other.name == null;                   //返回false
        } else return name.equals(other.name);                       //返回false
//返回true
    }

    /*
        为什么是31？
            1.  31是一个质数，质数是只能被1和自己本身整除的数；
            2.  31这个数既不大也不小
            3.  31这个数好算，是2^5-1，2向左移动5位
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + age;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }
}
