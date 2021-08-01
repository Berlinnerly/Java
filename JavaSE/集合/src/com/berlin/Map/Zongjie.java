package com.berlin.Map;

/**
 * @author Berlin
 * @Time 2020/11/3 11:40
 */

/*
    Collection
        List(存取有序，有索引，可以重复)
            ArrayList
                底层是数组实现的，线程不安全，查找和修改快，增和删比较慢
            LinkedList
                底层是链表实现的，线程不安全，增删快，查找和修改慢
            Vector
                底层是数组实现的，线程安全的，增删改查都慢
        如果查找和修改多用ArrayList
        如果增删多用LinkedList
        如果都多，用ArrayList

        Set(存取无序，无索引，不可以重复)
            HashSet
                底层是哈希算法实现
                LinkedHashSet
                    底层是链表实现，但是也可以保证元素唯一，和HashSet原理一样
            TreeSet
                地城是二叉树算法实现
            一般在开发的时候不需要对存储的元素排序，所以在开发的时候大多用HashSet，HashSet的效率比较高
            TreeSet在面试的时候比较多
    Map
        HashMap
            底层是哈希算法实现，针对键
            LinkedHashMap
                底层是链表实现，针对键
        TreeMap
            底层是二叉树算法，也是针对键
        开发中用HashMap比较多，
 */
public class Zongjie {
}
