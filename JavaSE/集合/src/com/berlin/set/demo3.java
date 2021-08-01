package com.berlin.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * @author Berlin
 * @Time 2020/10/30 16:19
 */

/*
    需求：将集合中的重复元素去掉

    分析：
        1.创建List集合存储若干个重复元素
        2.单独定义方法去除重复
        3.打印一下List集合
 */
public class demo3 {
    public static void main(String[] args) {
        //1.创建List集合存储若干个重复元素
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("c");
        list.add("c");
        list.add("c");

        //2.单独定义方法去除重复
        getSingle(list);

        //3.打印一下List集合
        System.out.println(list);
    }

    /*
        分析：
            去除List集合中的重复元素
            1.创建一个LinkedHash Set集合
            2.将List集合中所有的元素添加到Linked Hash Set集合
            3.将List集合中的元素清除
            4.将Linked Hash Set集合中的元素添加回List集合中
     */
    public static void getSingle(List<String> list) {
        // 1.创建一个LinkedHash Set集合
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        //2.将List集合中所有的元素添加到Linked Hash Set集合
        lhs.addAll(list);
        //3.将List集合中的元素清除
        list.clear();
        //4.将Linked Hash Set集合中的元素添加回List集合中
        list.addAll(lhs);
    }
}
