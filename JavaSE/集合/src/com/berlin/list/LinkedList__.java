package com.berlin.list;

import java.util.LinkedList;

/*
        用Linked List模拟栈结构
 */
public class LinkedList__ {
    public static void main(String[] args) {
//        demo1();
        Stack s = new Stack();
        s.in("a");
        s.in("b");
        s.in("c");
        s.in("d");
        while (!s.isEmply()) {
            System.out.println(s.out());
        }
    }

    public static void demo1() {
        LinkedList list = new LinkedList();             //创建集合对象
        list.addLast("a");
        list.addLast("b");
        list.addLast("c");
        list.addLast("d");

        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());
        System.out.println(list.removeLast());

        while (!list.isEmpty()) {
            System.out.println(list.removeLast());
        }
    }
}
