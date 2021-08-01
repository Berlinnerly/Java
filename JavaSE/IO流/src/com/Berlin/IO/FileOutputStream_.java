package com.Berlin.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/5 8:51
 */

/*
    FileOutputStream在创建对象的时候如果没有这个文件会自动创建
    如果有这个文件会将文件清空
 */
public class FileOutputStream_ {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("yyy.txt", true);             //创建字节输出流对象     如果想续写，就在第二个参数传true
        fos.write(97);                          //虽然写出的是一个int数，但是到文件上的是一个字节，会自动去除前三个八位；
        fos.write(98);
        fos.write(99);
        fos.close();
    }
}
