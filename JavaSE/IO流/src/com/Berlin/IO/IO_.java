package com.Berlin.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/4 13:24
 */

/*
    1.概念：
        IO流用来处理设备之间的数据传输；
        Java对数据的操作都是通过流的方式；
        Java用于操作流的类都在IO包中；
        流按流向分为输入流和输出流；
        流按操作类型分两种：
            字节流：字节流可以操作任何数据，因为在计算机中任何数据都是以字节的形式存储的；
            字符流：字符流只能操作纯字符数据，比较方便；
    2.IO流常用父类：
        字节流的抽象父类：
            InputStream
            OutputStream
        字符流的抽象父类：
            Reader；
            Writer；
    3.IO程序书写：
        使用前：导入IO包中的类；
        使用时：进行IO异常处理
        使用后：释放资源

        read()方法读取的是一个字节，为什么返回的是int,而不是byte
            因为字节输入流可以操作任意类型的文件，比如视频、音频、图片等，这些文件底层都是由二进制存储的，如果每次读取都返回byte，有可能在中间的时候遇到11111111，那么这
            11111111是byte类型的-1，程序是遇到-1就会停止，后面的数据就读不到了，所以读取的时候用int接收，如果遇到11111111会在前面补上24个0凑足4个字节，那么byte类型
            的-1就会变成int类型的255了，可以保证整个数据读完，而结束标记的-1就是int类型。
 */
public class IO_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        FileInputStream fis = new FileInputStream("xxx.txt");
        int b;
        while ((b = fis.read()) != -1) {
            System.out.println(b);
        }
        fis.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("xxx.txt");       //创建流对象
        int x = fis.read();                 //从硬盘上读取一个字节
        System.out.println(x);
        int y = fis.read();
        System.out.println(y);
        int z = fis.read();
        System.out.println(z);
        int a = fis.read();
        System.out.println(a);
        fis.close();                        //关流，释放资源
    }
}
