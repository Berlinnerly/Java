package com.Berlin.otherIO;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author Berlin
 * @Time 2020/11/8 22:19
 */

/*

 */
public class RandomAccessFile_ {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile("g.txt","rw");
//        raf.write(97);
//        int x = raf.read();
//        System.out.println(x);

        raf.seek(10);               //在指定位置设置指针
        raf.write(98);
        raf.close();
    }
}
