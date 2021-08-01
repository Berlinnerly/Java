package com.Berlin.bean;

/**
 * @Author: Berlinnerly
 * @Package: com.Berlin.bean
 * @FileName: Animal.java
 * @Tools: IntelliJ IDEA
 * @Time: 2021/6/29 13:35
 * @Blog: baigeinanhai.com
 * @Version: 1.0
 * @Description:
 */
public class Animal {
    private String name;
    private String color;
    private int age;

    public Animal(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
