package com.berlin.set;

import com.berlin.bean.Person;

import java.util.HashSet;

/**
 * @author Berlin
 * @Time 2020/10/29 8:46
 */

/*
    Set集合无索引，不可以重复，无序（存取不一致）
 */
public class hash_set_ {
    public static void main(String[] args) {
//        demo1();
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三",23));
        hs.add(new Person("张三",23));
        hs.add(new Person("张三",23));
        hs.add(new Person("李四",24));
        hs.add(new Person("李四",24));
        hs.add(new Person("李四",24));
        hs.add(new Person("李四",24));

        System.out.println(hs.size());
        System.out.println(hs);
    }

    public static void demo1() {
        HashSet<String> hs = new HashSet<>();                   //创建hashset对象
        hs.add("a");
        hs.add("b");
        hs.add("c");
        hs.add("d");
        boolean b1 = hs.add("a");
        boolean b2 = hs.add("a");                               //当向set集合中存储重复元素的时候，返回为false
        System.out.println(hs);                                 //Hash Set的继承体系中有重写toString方法

        for (String string : hs) {                              //只要能用迭代器迭代的，就可以使用增强for循环遍历
            System.out.println(string);
        }
    }
}
