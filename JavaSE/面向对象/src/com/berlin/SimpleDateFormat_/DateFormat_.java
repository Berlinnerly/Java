package com.berlin.SimpleDateFormat_;

import java.text.DateFormat;

/**
 * @author Berlin
 * date 2020/10/23 16:05
 */
public class DateFormat_ {
    public static void main(String[] args) {
        demo1();
    }

    public static void demo1() {
//        DateFormat d = new DateFormat();          DateFormat是一个抽象类，不能被实例化
//        DateFormat df1 = new SimpleDateFormat();

        // 相当于父类引用指向子类对象，右边的方法返回一个子类对象
        DateFormat df1 = DateFormat.getDateInstance();
//        System.out.println(df1);
    }
}
