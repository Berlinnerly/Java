package com.Berlin.otherIO;

import java.io.*;
import java.util.Enumeration;
import java.util.Vector;

/**
 * @author Berlin
 * @Time 2020/11/7 19:11
 */

/*
    SequenceInputStream(InputStream s1, InputStream s2)             整合两个输入流
    SequenceInputStream(Enumeration<? extends InputStream> e)             整合多个输入流

 */
public class SequenceInputStream_ {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2 = new FileInputStream("b.txt");
        FileInputStream fis3 = new FileInputStream("c.txt");

        Vector<InputStream> v = new Vector<>();             //创建集合对象
        v.add(fis1);                                        //将流对象存储起来
        v.add(fis2);
        v.add(fis3);

        Enumeration<InputStream> en = v.elements();
        SequenceInputStream sis = new SequenceInputStream(en);          //将枚举中的输入流整合成一个
        FileOutputStream fos = new FileOutputStream("d.txt");

        int b;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }
        sis.close();
        fos.close();
    }

    private static void demo2() throws IOException {
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileInputStream fis2 = new FileInputStream("b.txt");
        SequenceInputStream sis = new SequenceInputStream(fis1, fis2);
        FileOutputStream fos = new FileOutputStream("c.txt");

        int b;
        while ((b = sis.read()) != -1) {
            fos.write(b);
        }
        sis.close();
        fos.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis1 = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("c.txt");
        int b1;
        while ((b1 = fis1.read()) != -1) {
            fos.write(b1);
        }
        fis1.close();

        FileInputStream fis2 = new FileInputStream("b.txt");
        int b2;
        while ((b2 = fis2.read()) != -1) {
            fos.write(b2);
        }
        fis2.close();
        fos.close();
    }
}
