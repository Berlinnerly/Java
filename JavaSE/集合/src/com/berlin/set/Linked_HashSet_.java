package com.berlin.set;

import java.util.LinkedHashSet;

/**
 * @author Berlin
 * @Time 2020/10/30 14:29
 */

/*
    底层使用链表实现的,是SET集合中唯一一个能保证怎么存就怎么取的集合对象
    因为是Hash Set的子类，所以也是保证唯一的，与Hash Set的原理一致
 */
public class Linked_HashSet_ {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("a");
        lhs.add("a");
        lhs.add("a");
        lhs.add("b");
        lhs.add("c");
        lhs.add("d");

        System.out.println(lhs);
    }
}
