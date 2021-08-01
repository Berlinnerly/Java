package com.Berlin.reflect;

import com.Berlin.bean.Person;

/**
 * @author Berlin
 * @Time 2020/11/13 9:11
 */
public class Reflect_ {
    public static void main(String[] args) throws ClassNotFoundException {
        Class clazz1 = Class.forName("com.Berlin.bean.Person");
        Class clazz2 = Person.class;

        Person p = new Person();
        Class clazz3 = p.getClass();

        System.out.println(clazz1 == clazz2);
        System.out.println(clazz2 == clazz3);
    }
}
