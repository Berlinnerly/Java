package com.berlin.list;

import com.berlin.bean.Student;

import java.util.ArrayList;

/**
 * @author Berlin
 * @Time 2020/10/28 17:01
 */
/*
    集合嵌套之ArrayList嵌套Array List
    案例：
        我们有若干个学科，学科又分为若干的班级
        整个学科是一个大集合
        若干个班级分为每一个小集合
 */
public class ArrayListArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Student>> list = new ArrayList<>();
        ArrayList first = new ArrayList();         //创建第一个班级
        first.add(new Student("张三",23));
        first.add(new Student("李四",24));
        first.add(new Student("王五",25));

        ArrayList second = new ArrayList();
        second.add(new Student("杨幂",30));
        second.add(new Student("范冰冰",31));
        second.add(new Student("迪丽热巴",32));

        //将班级添加到学科集合中
        list.add(first);
        list.add(second);

        //遍历学科集合
        for (ArrayList<Student> a : list) {
            for (Student s : a) {
                System.out.println(s);
            }
        }

    }
}
