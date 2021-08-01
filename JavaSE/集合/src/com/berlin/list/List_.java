package com.berlin.list;

import java.util.ArrayList;

/*

 */
public class List_ {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        list.set(1,"u");
        System.out.println(list);
    }

    public static void demo4() {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

//        Object obj = list.get(0);
//        System.out.println(obj);
        //通过索引遍历List集合
        for (int i = 0;i < list.size();i++) {
            System.out.println(list.get(i));
        }
    }

    public static void demo3() {
        ArrayList list = new ArrayList();
        list.add(111);
        list.add(222);
        list.add(333);
//        list.remove(111);             //删除的时候不会自动装箱，把111当成索引了
    }

    public static void demo2() {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        Object obj = list.remove(1);
        System.out.println(obj);
        System.out.println(list);
    }

    public static void demo1() {
        ArrayList list = new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add(1,"e");
        list.add(4,"f");        //index<=size并且index>=0都不会报异常
//        list.add(10,"z");                 索引越界异常IndexOutOfBoundsException
        System.out.println(list);
    }
}
