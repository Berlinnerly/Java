package com.berlin.list;

import java.util.ArrayList;
import java.util.Iterator;

/*
    需求：
        Array List中去除集合中字符串的重复值
        思路：创建新集合方式
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class demo1_quchong {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");

        ArrayList a = getSingle(list);
        System.out.println(a);
    }

    /*
        创建新集合将重复元素去掉
        1.明确返回值类型，返回Arraylist
        2.明确参数列表：Array List

        分析：
        1.创建新集合；
        2.根据传入的集合获取迭代器
        3.遍历老集合
        4.通过新集合判断是否包含老集合中的元素，包含就不添加，不包含就添加
     */

    public static ArrayList getSingle(ArrayList list) {
        //创建新集合
        ArrayList newList = new ArrayList();
        //获取迭代器
        Iterator it = list.iterator();
        //遍历老集合
        while (it.hasNext()) {
            Object obj = it.next();         //记录每一个元素
            if (!newList.contains(obj)) {   //如果新集合不包含老集合中的元素
                newList.add(obj);           //将该元素添加
            }
        }
        return newList;

    }
}
