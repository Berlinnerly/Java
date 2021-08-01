package com.Berlin.otherIO;

import com.Berlin.bean.Person;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author Berlin
 * @Time 2020/11/8 21:27
 */

/*
    PrintStream和PrintWriter分别是打印的字节流和字符流
    只操作数据目的
 */
public class PrintStream_ {
    public static void main(String[] args) throws FileNotFoundException {
//        demo1();

        PrintWriter pw = new PrintWriter(new FileOutputStream("f.txt", true));
        pw.println(97);             //自动刷出功能只针对的时println方法
        pw.write(97);
        pw.close();
    }

    private static void demo1() {
        System.out.println("aaa");
        PrintStream ps = System.out;            //获取标准输出流
        ps.println(97);                         //底层通过Integer.toString()方法将97转换成字符串并打印
        ps.write(97);                       //查找码表找到对应的a并打印；

        Person p1 = new Person("张三",23);
        ps.println(p1);                         //默认调用p1的toString方法

        Person p2 = null;                       //打印引用数据类型，如果是null就打印null，不是null，就打印对象的toString方法
        ps.println(p2);
        ps.close();
    }
}
