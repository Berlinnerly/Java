package com.berlin.wrapclass;

/**
 * @author Berlin
 * date 2020/10/22 15:07
 */

/*
    JDK5的新特性：
        自动装箱：把基本数据类型转换为包装类类型；
        自动拆箱：把包装类类型转换为基本数据类型；
 */
public class JDK5 {
    public static void main(String[] args) {
//        int i = 100;
//        Integer x = new Integer(i);         //将基本数据类型包装成对象；，手动装箱；
//
//        int y = x.intValue();               //将对象转换为基本数据类型，手动拆箱


        Integer i2 = 100;           //自动装箱；
        int z = i2 + 200;           //自动拆箱;
        System.out.println(z);

        Integer i3 = null;
        int a = i3 + 100;
        System.out.println(a);
    }
}
