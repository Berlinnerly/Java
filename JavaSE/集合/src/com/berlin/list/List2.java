package com.berlin.list;

import com.berlin.bean.Student;

import java.util.List;
/*
    向list集合中存储学生对象
    通过size()和get()方法结合遍历
 */

import java.util.ArrayList;

public class List2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));
        list.add(new Student("赵六",26));

        for (int i = 0;i < list.size();i++) {
//            System.out.println(list.get(i));            //通过索引获取每一个元素
            Student s = (Student)list.get(i);
            System.out.println(s.getName() + "..." + s.getAge());
        }
    }
}
