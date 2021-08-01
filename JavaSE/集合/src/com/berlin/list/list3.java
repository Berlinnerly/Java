package com.berlin.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*
    需求：
        有一个集合，请问，我想判断里边有没有“wrold”这个元素，如果有，我就添加一个"javaee".
 */
@SuppressWarnings({"rawtypes","checked"})
public class list3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");                          //自动类型提升为Object
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("world");
        list.add("e");

//        Iterator it = list.iterator();          //获取迭代器
//        while (it.hasNext()) {                  //判断集合中是否有元素
//            String str = (String)it.next();
//            if ("world".equals(str)) {
//                list.add("javaee");             //遍历的同时在修改元素，并发修改ConcurrentModificationException
//            }
//
//        }
//        System.out.println(list);
        ListIterator lit = list.listIterator();     //获取迭代器，list集合特有的方法
        while (lit.hasNext()) {
            String str = (String)lit.next();
            if ("world".equals(str)) {
                lit.add("javaee");
            }
        }
        System.out.println(list);
    }
}
