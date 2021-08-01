package com.berlin.set;

import com.berlin.bean.Person;
import com.berlin.bean.Student;

import java.util.Comparator;
import java.util.TreeSet;

/*
    TreeSet集合是用来对元素进行排序的，同样他也可以保证元素的唯一
    当compareTo方法返回0的时候，集合中只有一个元素
    当compareTo方法返回正数的时候，集合会怎么存就怎么取
    当compareTo方法返回负数的时候，集合会倒序存储


    二叉树：
        小的存储在左边（负数），大的存储在右边（正数），相等就不存（0）
        compareTo方法，在TreeSet集合如何存储元素取决于compareTo方法的返回值
        1.返回0集合中只有一个元素
        2.返回—1，集合会将存储的元素倒序
        3.返回正数，集合怎么存就怎么取

    1.特点：
        TreeSet是用来排序的，可以指定一个顺序，存入对象后会按照指定的顺序排序
    2.使用方式：
        a.自然排序（comparable）:
            TreeSet类的add()方法中会把存入的对象提升为Comparable类型
            调用对象的comparaTo()方法和集合中的对象比较
            根据comparaTo()方法返回的结果进行存储
        b.比较器排序（comparator）
            创建TreeSet的时候制定一个Compator
            如果传入了Comparator的子类对象，那么TreeSet就会按照比较器中的顺序排序
            add()方法内部会自动调用Comparator接口中compare()方法排序
        c.两种方式的区别：
            TreeSet构造函数什么都不传，默认按照类中Comparable的顺序（没有就报错）
            TreeSet如果传入Comparator,就优先按照Comparator

 */
/**
 * @author Berlin
 * @Time 2020/11/2 8:50
 */
public class TreeSet_ {
    public static void main(String[] args) {
//        demo1();
//        demo2();
//        demo3();
//        demo4();
        //需求：将字符串按照长度排序
        TreeSet<String> ts = new TreeSet<>(new CompareByLen());     //Comparator c = new CompareByLen
        ts.add("aaaaaaaaa");
        ts.add("z");
        ts.add("wc");
        ts.add("nba");
        System.out.println(ts);

    }

    public static void demo4() {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("zhangsan", 23));
        ts.add(new Student("lisi", 13));
        ts.add(new Student("wangwu", 33));
        ts.add(new Student("zhaoliu", 43));
        ts.add(new Student("aaaa", 53));
        System.out.println(ts);
    }

    public static void demo3() {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("张三",23));
        ts.add(new Student("李四",13));
        ts.add(new Student("王五",43));
        ts.add(new Student("赵六",33));

//        System.out.println('张' + 0);
//        System.out.println('李' + 0);
//        System.out.println('王' + 0);
//        System.out.println('赵' + 0);
        System.out.println(ts);
    }

    public static void demo2() {
        TreeSet<Student> ts = new TreeSet<>();
        ts.add(new Student("张三",23));
        ts.add(new Student("李四",24));
        ts.add(new Student("王五",25));
        ts.add(new Student("赵六",26));

        System.out.println(ts);
    }

    public static void demo1() {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(1);
        ts.add(2);
        ts.add(2);
        ts.add(3);
        ts.add(3);
        ts.add(3);

        System.out.println(ts);
    }
}

class CompareByLen implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {          //按照字符串的长度比较
        int num = s1.length() - s2.length();            //长度为主要条件
        return num == 0 ? s1.compareTo(s2) : num;       //内容为次要条件
    }
}
