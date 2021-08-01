package com.berlin.collection1;

import com.berlin.bean.Student;

public class Array_ {
    public static void main(String[] args) {
    //        int[] arr = new int[5];               基本数据类型数组
        Student[] arr = new Student[5];             //创建引用数据类型数组
        arr[0] = new Student("张三",23);  //创建一个学生对象，存储在第一个位置
        arr[1] = new Student("李四",24);  //创建一个学生对象，存储在第二个位置
        arr[2] = new Student("王五",25);  //创建一个学生对象，存储在第三个位置

        for (Student student : arr) {
            System.out.println(student);
        }
    }
}
