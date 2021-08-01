package com.berlin.bean;

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {}
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age +"]";
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student)obj;
        return this.name.equals(s.name) && this.age ==s.age;
    }

    //按照年龄排序
//    @Override
//    public int compareTo (Student o) {
//        int num = this.age - o.age;             //年龄是比较的主要条件
//        return num == 0 ? this.name.compareTo(o.name) : num;        //姓名是比较的次要条件
//    }

//    //按照姓名排序
//    @Override
//    public int compareTo (Student o) {
//        int num = this.name.compareTo(o.name);      //姓名是主要条件
//        return num == 0 ? this.age - o.age : num;   //年龄是次要条件
//    }

    //按照姓名长度排序
        @Override
    public int compareTo (Student o) {
        int length = this.name.length() - o.name.length();      //比较长度为主要条件
        int num = length == 0 ? this.name .compareTo(o.name) : length;      //比较内容为次要条件
        return num == 0 ? this.age - o.age : num;       //比较年龄也为次要条件
        }


}
