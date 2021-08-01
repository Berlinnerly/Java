package com.berlin.jdk5;

import com.berlin.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Berlin
 * @Time 2020/10/28 9:36
 */

/*
        增强for循环
            简化数组和Collection集合的遍历
        格式：
            for(原始数据类型 变量： 数组或者Collection集合) {
                使用变量即可，该变量就是元素
            }
        好处：
            简化遍历
 */
public class Foreach {
    public static void main(String[] args) {
//        demo();
//        demo2();
//        demo3();
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        list.add("d");

//        //普通for循环删除,索引要--
//        for (int i = 0; i < list.size(); i++) {
//            if ("b".equals(list.get(i))) {
//                list.remove(i--);
//            }
//        }
//        //2.迭代器删除
//        Iterator<String> it = list.iterator();
//        while (it.hasNext()) {
//            if ("b".equals(it.next())) {
////                list.remove("b");         不能用集合的删除方法，因为在迭代的过程中如果修改会出现并发修改异常
//                it.remove();
//            }
//        }
//        System.out.println(list);

        for (Iterator<String> it2 = list.iterator(); it2.hasNext();) {
            if ("b".equals(it2.next())) {
                it2.remove();
            }
        }
        System.out.println(list);

        //3.增强for循环不能删除，只能遍历        并发修改异常
//        for (String string : list) {
//            if ("b".equals(string)) {
//                list.remove("b");
//            }
//        }
//        System.out.println(list);
    }

    public static void demo3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("b");
        list.add("d");

//        //普通for循环删除,索引要--
//        for (int i = 0; i < list.size(); i++) {
//            if ("b".equals(list.get(i))) {
//                list.remove(i--);
//            }
//        }
        //2.迭代器删除
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if ("b".equals(it.next())) {
//                list.remove("b");         不能用集合的删除方法，因为在迭代的过程中如果修改会出现并发修改异常
                it.remove();
            }
        }
        System.out.println(list);
    }

    public static void demo2() {
            ArrayList<Student> list = new ArrayList<>();
            list.add(new Student("张三", 23));
            list.add(new Student("李四", 24));
            list.add(new Student("王五", 25));
            for (Student stu : list) {
                System.out.println(stu);
            }
        }


        public static void demo() {
            int[] arr = {11, 22, 33, 44, 55};
            for (int i : arr) {
                System.out.println(i);
            }

            ArrayList<String> list = new ArrayList<>();
            list.add("a");
            list.add("b");
            list.add("c");
            list.add("d");

            for (String string : list) {
                System.out.println(string);
            }
        }
    }


