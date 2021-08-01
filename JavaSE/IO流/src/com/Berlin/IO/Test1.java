package com.Berlin.IO;

import java.io.*;

/**
 * @author Berlin
 * @Time 2020/11/5 14:57
 */

/*
    IO流图片加密

    将写出的字节异或上一个数，这个数就是密钥，解密的时候再次亦或就可以了
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("copy.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy2.jpg"));

        int b;
        while ((b = bis.read()) != -1) {
            bos.write(b ^ 123);
        }
        bis.close();
        bos.close();
    }
}
