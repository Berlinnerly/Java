package com.Berlin.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/5 14:13
 */

/*
    字节流读取中文的问题；
        字节流在读中文的时候有可能会读到半个中文，造成乱码；
    字节流写出中文的问题：
        字节流直接操作的字节，所以写出中文必须将字符串转换成字符数组；
        写出回车换行write("\r\n.getBytes()");
 */
public class Chinese_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        FileOutputStream fos = new FileOutputStream("zzz.txt");
        fos.write("你好你好".getBytes());
        fos.write("\r\n".getBytes());
        fos.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("yyy.txt");
        byte[] arr = new byte[3];
        int len;
        while ((len = fis.read(arr)) != -1) {
            System.out.println(new String(arr, 0, len));
        }
        fis.close();
    }
}
