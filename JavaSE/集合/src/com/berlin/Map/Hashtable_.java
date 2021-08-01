package com.berlin.Map;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @author Berlin
 * @Time 2020/11/3 9:11
 */

/*
    HashMap和Hashtable的区别
        共同点：
            底层都是哈希算法
            都是双列集合
        区别：
            1.Hash Map是线程不安全的，效率高JDK1.2版本
              Hash table是线程安全的，效率相对低，JDK1.0版本
            2.Hash Map可以存储null键和null值
              Hash table不可以存储null键和null值

 */
public class Hashtable_ {
    public static void main(String[] args) {
//        HashMap<String, Integer> hm = new HashMap<>();
//        hm.put(null, 23);
//        hm.put("李四", null);
//        System.out.println(hm);

        Hashtable<String, Integer> ht = new Hashtable<>();
        ht.put(null, 23);
        ht.put("李四",null);
        System.out.println(ht);
    }
}
