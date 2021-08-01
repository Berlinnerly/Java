package com.Berlin.IO;

import java.io.*;

/**
 * @author Berlin
 * @Time 2020/11/5 13:33
 */

/*  BufferInputStream
        BufferInputStream内置了一个缓冲区（数组）；
        从BufferInputStream中读取一个字节时
        BufferInputStream会一次性从文件中读取8192个，存在缓冲区中，返回给程序一个；
        程序再次读取文件时，就不用找文件了，直接从缓冲区中获取；
        直到缓冲区中所有的都被使用过，才重新从文件中读取8192个；

    BufferedOutputStream
        BufferedOutputStream也内置了一个缓冲区（数组）；
        程序向流中写入字节时，不会直接写到文件，先写到缓冲区中；
        直到缓冲区写满，BufferedOutputStream才会把缓冲区中的数据一次性写到文件里；

    小数组的读写和带Buffered的读取哪个更快？
        定义小数数组如果是8192个字节大小和Buffered比较的话；
        定义小数数组会略胜一筹，因为读和写操作的是同一个数组；
        而Buffered操作的是两个数组；

    close()方法具备刷新的功能，在关闭流之前，就会刷新一次缓冲区，将缓冲区的字节全都刷新到文件上，再关闭，close方法刷了之后就不能写了；
    flush()?
        具备刷新的功能，刷完之后还可以继续写
 */
public class Buffer_Copy_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("20180403 二珂 老公天下第一.mp3"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.mp3"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }
        bos.flush();
//        bis.close();
//        bos.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("20180403 二珂 老公天下第一.mp3");           //创建输入流对象
        FileOutputStream fos = new FileOutputStream("copy.mp3");                            //创建输出流对象
        BufferedInputStream bis = new BufferedInputStream(fis);                                   //创建缓冲区对象，对输入流进行包装使其更加强大
        BufferedOutputStream bos = new BufferedOutputStream(fos);
        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b);
        }

        bis.close();
        bos.close();
    }
}
