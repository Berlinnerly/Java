package com.berlin.Collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @author Berlin
 * @Time 2020/11/3 9:23
 */

/*
    Collections中的常见方法：
        public static <T> void sort(List<T> list)                   排序
        public static <T> int binarySearch(List<?> list,T key)      二分查找法
        public static <T>  T max sort(Collection<T> coll)           根据默认排序结果获取集合中的最大值
        public static void reverse(List<?> list)                    反转
        public static void shuffle(List<?> list)                    随机置换,可以用来洗牌
 */
public class Collections_ {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

//        System.out.println(Collections.max(list));
//        Collections.reverse(list);
        Collections.shuffle(list);
        System.out.println(list);
    }

    public static void demo2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");
        list.add("g");

        System.out.println(Collections.binarySearch(list, "c"));
        System.out.println(Collections.binarySearch(list, "b"));
    }

    public static void demo1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("c");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("d");

        System.out.println(list);
        Collections.sort(list);                 //将集合排序
        System.out.println(list);
    }
}
