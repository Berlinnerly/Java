package com.Berlin.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/5 10:02
 */

/*

 */
public class Copy_ {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
    }

    private static void demo2() throws IOException {
        //这种也不推荐使用，因为有可能导致内存溢出
        FileInputStream fis = new FileInputStream("20180403 二珂 老公天下第一.mp3");
        FileOutputStream fos = new FileOutputStream("copy.mp3");

        byte[] arr = new byte[fis.available()];                             //创建跟文件一样大小的字节数组；
        fis.read(arr);                                                      //将文件上的字节读取到内存中；
        fos.write(arr);                                                     //将字节数组中的字节数据写到文件上；
        fis.close();
        fos.close();
    }

    private static void demo1() throws IOException {
        //效率过低，不推荐使用
        FileInputStream fis = new FileInputStream("1.jpg");             //创建输入流对象
        FileOutputStream fos = new FileOutputStream("copy.jpg");        //创建输出流对象
        int b;
        while ((b = fis.read()) != -1) {                //不断读取每一个字节
            fos.write(b);                               //将每一个字节写出
        }
        fis.close();
        fos.close();                                    //关流，释放资源
    }
}
