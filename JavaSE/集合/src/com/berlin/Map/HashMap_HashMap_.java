package com.berlin.Map;

import com.berlin.bean.Student;

import java.util.HashMap;

/**
 * @author Berlin
 * @Time 2020/11/3 8:48
 */

/*
    案例演示：
        HashMap嵌套HashMap

    需求：
        双元课堂第88期基础班定义成一个集双列合，键是学生对象，值是学生的归属地
        双元课堂第99期基础班定义成一个集双列合，键是学生对象，值是学生的归属地

        无论是88还是99都是班级对象，所以为了统一管理，把这些班级对象添加到双元课堂集合中
 */
public class HashMap_HashMap_ {
    public static void main(String[] args) {
        //定义88期基础班
        HashMap<Student,String> hm88 = new HashMap<>();
        hm88.put(new Student("张三",23),"北京");
        hm88.put(new Student("李四",24),"北京");
        hm88.put(new Student("王五",25),"上海");
        hm88.put(new Student("赵六",26),"广州");

        //定义99期基础班
        HashMap<Student,String> hm99 = new HashMap<>();
        hm99.put(new Student("唐僧",1023),"北京");
        hm99.put(new Student("悟空",1024),"北京");
        hm99.put(new Student("八戒",1025),"上海");
        hm99.put(new Student("悟净",1026),"广州");

        //定义双元课堂
        HashMap<HashMap<Student,String>, String> hm = new HashMap<>();
        hm.put(hm88,"第88期基础班");
        hm.put(hm99,"第99期基础班");

        //遍历双列集合
        for (HashMap<Student, String> h : hm.keySet()) {    //hm.keySet()代表的是双列集合中键的集合
            String value = hm.get(h);                       //get(h)根据键对象获取值对象
            //遍历键的双列集合对象
            for (Student key : h.keySet()) {                //h.keySet()是获取集合中所有的学生键对象
                String value2 = h.get(key);

                System.out.println(key + "=" + value2 + "=" + value);
            }
        }
    }
}
