package com.berlin.set;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

import static java.util.Collections.sort;

/**
 * @author Berlin
 * @Time 2020/11/2 10:21
 */

/*
    在一个集合中存储了无序并且重复的字符串，定义一个方法，让其有序（字典顺序），而且还不能去重复

    分析：
        1.定义一个List集合，并存储重复的无序的字符串；
        2.定义方法进行排序保留重复
        3.打印List集合
 */
public class test1 {
    public static void main(String[] args) {
        //1.定义一个List集合，并存储重复的无序的字符串；
        ArrayList<String> list = new ArrayList();
        list.add("aaa");
        list.add("aaa");
        list.add("ccc");
        list.add("ddd");
        list.add("ffffffffffff");
        list.add("heima");
        list.add("itcast");
        list.add("bbbb");
        list.add("aaa");
        list.add("aaa");

        //2.定义方法进行排序保留重复
        sort(list);

        //3.打印List集合
        System.out.println(list);
    }

    //定义方法，排序并保留重复
    /*
        分析：
            1.创建TreeSet集合对象，因为String本身就具备比较功能，但是重复的不会保留
            2.将List集合中所有的元素添加到TreeSet集合中，对其排序，并保留重复
            3.清空List集合
            4.将TreeSet集合中排好序的元素添加到List集合中
     */
    public static void sort(ArrayList<String> list) {
        //1.创建TreeSet集合对象，因为String本身就具备比较功能，但是重复的不会保留
        TreeSet<String> ts = new TreeSet<String>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
               int num = s1.compareTo(s2);
               return num == 0 ? 1 : num;
           }
        });
        //2.将List集合中所有的元素添加到TreeSet集合中，对其排序，并保留重复
        ts.addAll(list);
        //3.清空List集合
        list.clear();
        //4.将TreeSet集合中排好序的元素添加到List集合中
        list.addAll(ts);
    }
}
