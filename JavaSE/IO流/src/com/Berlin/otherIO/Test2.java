package com.Berlin.otherIO;

import java.io.*;

/**
 * @author Berlin
 * @Time 2020/11/8 22:11
 */

/*

 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("1.jpg"));             //改变标准输入流
        System.setOut(new PrintStream("copy.jpg"));             //改变标准输出流

        InputStream is = System.in;
        PrintStream ps = System.out;

        byte[] arr = new byte[1024];
        int len;

        while ((len = is.read(arr)) != -1) {
            ps.write(arr,0,len);
        }

        is.close();
        ps.close();
    }
}
