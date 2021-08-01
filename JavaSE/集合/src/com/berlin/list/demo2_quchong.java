package com.berlin.list;

import com.berlin.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

/*
    contains方法判断是否包含，底层依赖的是equals方法
    remove方法判断是否删除，底层也是依赖equals方法
 */
public class demo2_quchong {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();       //创建集合对象
        list.add(new Student("张三", 23));
        list.add(new Student("张三", 23));
        list.add(new Student("李四", 24));
        list.add(new Student("李四", 24));
        list.add(new Student("李四", 24));
        list.add(new Student("王五", 25));
        list.add(new Student("王五", 25));
        list.add(new Student("王五", 25));
        list.add(new Student("王五", 25));
        list.add(new Student("王五", 25));

//        ArrayList newList = getSingle(list);            //调用方法，去除重复
//        System.out.println(newList);
        list.remove(new Student("张三",23));
        System.out.println(list);

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

