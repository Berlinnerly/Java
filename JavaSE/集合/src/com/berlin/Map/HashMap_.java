package com.berlin.Map;

import com.berlin.bean.Student;

import java.util.HashMap;

/**
 * @author Berlin
 * @Time 2020/11/2 17:02
 */

/*
    案例演示：
        HashMap集合键是Student，值是String的案例
        键是学生对象，代表每一个学生；
        值是字符串对象，代表的是学生的归属地
 */
public class HashMap_ {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<>();
        hm.put(new Student("张三",23), "北京");
        hm.put(new Student("张三",23), "西安");
        hm.put(new Student("王五",24), "上海");
        hm.put(new Student("李四",25), "广州");

        System.out.println(hm);
    }
}
