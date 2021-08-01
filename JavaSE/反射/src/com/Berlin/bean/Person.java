package com.Berlin.bean;

import java.util.Objects;

/**
 * @author Berlin
 * @Time 2020/11/13 9:07
 */
public class Person {
    private String name;
    private int age;

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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return getAge() == person.getAge() &&
                getName().equals(person.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void eat() {
        System.out.println("今天吃了一顿金钱豹");
    }

    public void eat(int num) {
        System.out.println("今天吃了" + num + "顿金钱豹");
    }
}
