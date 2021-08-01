package com.Berlin.reflect;

import com.Berlin.bean.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @author Berlin
 * @Time 2020/11/13 10:13
 */

/*
    Class类的newInstance()方法是使用该类无参的构造函数创造对象，如果一个类没有无参的构造函数，就不能这样创建了，可以调用Class的getConstructor
    (String.class, int.class)方法获取一个指定的构造函数然后再调用Constructor类的new Instance()方法创建对象
 */
public class Constructor_ {
    public static void main(String[] args) throws Exception {
        Class clazz = Class.forName("com.Berlin.bean.Person");
        Constructor c = clazz.getConstructor(String.class, int.class);          //获取有参构造
        Person p = (Person) c.newInstance("张三", 23);                     //通过有参构造创建对象

//        Field f = clazz.getField("name");                                    获取姓名字段
//        f.set(p, "李四");                                                    //修改姓名的值
        Field f = clazz.getDeclaredField("name");                       //暴力反射获取字段
        f.setAccessible(true);                                                  //去除私有权限
        f.set(p, "李四");

        System.out.println(p);
    }
}
