package com.berlin.list;

import java.util.ArrayList;
import java.util.Iterator;

/*

 */
public class ListIterator_ {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");

        Iterator lit = list.listIterator();             //获取迭代器
        while (lit.hasNext()) {
            System.out.println(lit.next());             //获取元素并将指针向后移动
        }

//        while (lit.hasPrevious()) {
//            System.out.println(lit.previous());       //获取元素并将指针向前移动
//        }
    }
}
