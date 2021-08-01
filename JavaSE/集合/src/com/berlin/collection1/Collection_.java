package com.berlin.collection1;

import com.berlin.bean.Student;

import java.util.ArrayList;
import java.util.Collection;

/*
    基本功能：
        boolean add(E e);                   向集合内添加元素
        boolean remove(Object o);           删除元素
        void clear();                       清空集合
        boolean contains(Object o);         判断是否包含
        boolean isEmpty();                  判断是否为空
        int size();                         获取元素个数

        add方法如果是List集合一直都返回true，因为List集合中是可以存储重复元素的。
        如果是Set集合当存储重复元素时，就会返回false

        ArrayList的的父类的父类重写了toString方法，所以在打印对象引用的时候，输出的结果不是Object类中的toString结果
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class Collection_ {
    public static void main(String[] args) {
//        demo1();
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

//        c.remove("b");                          //删除指定元素
//        c.clear();
//        System.out.println(c.contains("b"));
//        System.out.println(c.isEmpty());
        System.out.println(c.size());
        System.out.println(c);
    }

    public static void demo1() {
        Collection c = new ArrayList();             //父类引用指向子类对象；
        boolean b1 = c.add("abc");
        boolean b2 = c.add(true);                   //自动装箱； new boolean(true)
        boolean b3 = c.add(100);
        boolean b4 = c.add(new Student("张三", 23));
        boolean b5 = c.add("abc");

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
    }
}
