package com.Berlin.bean;

import java.io.Serializable;

/**
 * @author Berlin
 * @Time 2020/11/8 20:51
 */
public class Person implements Serializable {
    private static final long serialVersionUID = 2L;
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

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
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
