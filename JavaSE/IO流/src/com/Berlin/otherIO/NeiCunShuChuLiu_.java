package com.Berlin.otherIO;

//import com.sun.org.apache.xpath.internal.operations.String;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/8 20:19
 */

/*
    ByteArrayOutputStream   内存输出流

    FileInputStream字节输入流读取中文时乱码

    解决方法：
        1.字符流读取；
        2.ByteArrayOutputStream
 */
public class NeiCunShuChuLiu_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        FileInputStream fis = new FileInputStream("e.txt");
        ByteArrayOutputStream baos = new ByteArrayOutputStream();       //在内存中创建了可以自动增长的内存数组
        int b;
        while ((b = fis.read()) != -1) {
            baos.write(b);
        }
//        byte[] arr = baos.toByteArray();                //将缓冲区内的数据全部获取出来并赋值给arr数组
//        System.out.println(new String(arr));
        System.out.println(baos.toString());            //将缓冲区的内容转换为了字符串，在输出语句中可以省略调用toString方法
        fis.close();
//        baos.close();
    }

    private static void demo1() throws IOException {
        FileInputStream fis = new FileInputStream("e.txt");
        byte[] arr = new byte[3];
        int len;
        while ((len = fis.read(arr)) != -1) {
//            System.out.println(new String(arr,0,len));
        }
        fis.close();
    }
}
