package com.Berlin.chario;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/5 15:48
 */

public class FileRead_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        FileReader fr = new FileReader("xxx.txt");
        int c;
        while ((c = fr.read()) != -1) {                     //通过项目默认的码表一次读取一个字符
            System.out.println((char)c);
        }
        fr.close();
    }

    private static void demo1() throws IOException {
        FileReader fr = new FileReader("xxx.txt");
        int x = fr.read();
//        System.out.println(x);
        char c = (char)x;
        System.out.println(c);
        fr.close();
    }
}
