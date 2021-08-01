package com.berlin.bean;

/**
 * @Author Berlin
 * @Date 2021/1/11 11:11 星期一
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Student stu = new Student("张三", 23);
        String str = stu.toString();
        System.out.println(str);
    }
}
