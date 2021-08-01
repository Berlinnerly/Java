package com.berlin.set;

import java.util.HashSet;
import java.util.Random;

/**
 * @author Berlin
 * @Time 2020/10/30 14:36
 */

/*
    需求：
        编写一个程序，获取10个1-20之间的随机数，要求随机数不能重复，并把最终的随机数输出到控制台

    分析：
        1.使用Random类创建随机数对象
        2.需要存储10个随机数，而且不能重复，所以我们用Hash Set集合
        3.如果Hash Set的size是小于10就可以不断的存储，如果大于等于10就停止存储。
        4.通过Random类中的nextInt()方法获取1-20之间的随机数，并将这些随机数存储在Hash Set集合中
        5.遍历Hash Set
 */
public class demo1 {
    public static void main(String[] args) {
        //1.使用Random类创建随机数对象
        Random r = new Random();
        //2.需要存储10个随机数，而且不能重复，所以我们用Hash Set集合
        HashSet<Integer> hs = new HashSet<>();              //泛型不能写基本数据类型，要写包装类
        //3.如果Hash Set的size是小于10就可以不断的存储，如果大于等于10就停止存储。
        while (hs.size() < 10) {
        //4.通过Random类中的nextInt(n)方法获取1-20之间的随机数，并将这些随机数存储在Hash Set集合中
            hs.add(r.nextInt(20) + 1);
        }
        //5.遍历Hash Set
        for (Integer integer : hs) {
            System.out.println(integer);
        }
    }
}
