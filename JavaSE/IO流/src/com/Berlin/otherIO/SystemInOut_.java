package com.Berlin.otherIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;

/**
 * @author Berlin
 * @Time 2020/11/8 21:47
 */

/*

 */
public class SystemInOut_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        System.setIn(new FileInputStream("a.txt"));     //改变标准输入流
        System.setOut(new PrintStream("b.txt"));        //改变标准输出流

        InputStream is = System.in;             //获取标准的键盘输入流，默认指向键盘，改变后指向文件
        PrintStream ps = System.out;            //获取标准输出流，默认指向控制台，改变后指向文件

        int b;
        while ((b = is.read()) != -1) {
            ps.write(b);
        }
        System.out.println();           //也是一个输出流，不用关，因为没有和硬盘上的文件产生关联
        is.close();
        ps.close();
    }

    private static void demo1() throws IOException {
        InputStream is = System.in;
        int x = is.read();
        System.out.println(x);
        is.close();

        InputStream is2 = System.in;
        int y = is.read();
        System.out.println(y);
    }
}
