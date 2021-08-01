package com.berlin.String;

/*
    hashCode()                      返回该对象的哈希码值（int类型）
    getClass()                      返回此Object对象的运行时类
    toString()
    equals()                        指示其他某个对象是否与此对象相等（boolean）

    快捷键：
    生成构造方法和get set方法：alt + ins
    方法重写：CTRL + o
 */
public class Demo1_hashCode {
    public static void main(String[] args) {
        Object o1 = new Object();
        int hash = o1.hashCode();
        System.out.println(hash);

//        Student s = new Student();
//        String i = s.toString();
//        System.out.println(i);

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return name;
    }
}

