package com.berlin.list;

import java.util.Enumeration;
import java.util.Vector;


/*
    list的三个子类特点
        Array List：
            底层数据结构是数组，查询快，增删慢；
            线程不安全，但是效率高
        vector:
            底层数据结构是数组，查询快，增删慢；
            线程安全，效率低

        Vector相对Array List查询慢（线程安全）
        Vector相对Array List增删慢（数组结构）
        都是通过数组实现的

    LinkedList：
        底层数据结构是链表，查询慢，增删快
        线程不安全，效率高

    Array List和Linked List的区别：
        Array List底层是数组结构，查询和修改快
        Linked List底层是链表结构，增删快，查询和修改慢
        共同点：都是线程不安全的

    使用：
        查询多用Array List
        增删多用Linked List
        都多用Array List

 */
public class Vector_ {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.addElement("a");
        v.addElement("b");
        v.addElement("c");
        v.addElement("d");

        Enumeration en = v.elements();              //获取枚举
        while (en.hasMoreElements()) {              //判断集合中是否有元素
            System.out.println(en.nextElement());   //获取集合中的元素
        }
    }
}
