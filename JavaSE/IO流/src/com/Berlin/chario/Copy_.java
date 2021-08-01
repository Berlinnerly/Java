package com.Berlin.chario;

import java.io.*;

/**
 * @author Berlin
 * @Time 2020/11/6 8:42
 */

/*
    字符流也可以拷贝文本文件，但不推荐使用，因为读取时会把字节转为子符，写出时还要把字符转会字节；
    程序需要读取一段文本，或者需要写出一段文本的时候可以用字符流；（只读或只写）
    读取的时候是按照字符的大小读取的，不会出现半个中文；
    写出的时候可以直接将字符串写出，不用转换为字节数组；


    字符流是否可以拷贝非纯文本文件？
    不可以拷贝非纯文本文件
    因为在读的时候会将字节转换为字符，在转换过程中，可能找不到对应的字符，就会用？代替，写出的时候会将字符转换成字节写出去，
    如果是？直接写出，这样写出之后的文件就乱了，看不了了
 */
public class Copy_ {
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
//        demo3();
        BufferedReader br = new BufferedReader(new FileReader("xxx.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("yyy.txt"));

        int c;
        while ((c = br.read()) != -1) {
            bw.write(c);
        }

        br.close();
        bw.close();

    }

    private static void demo3() throws IOException {
        FileReader fr = new FileReader("xxx.txt");
        FileWriter fw = new FileWriter("yyy.txt");
        char[] arr = new char[1024];
        int len;
        while ((len = fr.read(arr)) != -1) {                    //将文件上的数据读取到字符数组中
            fw.write(arr, 0, len);                            //将字符数组上的数据写到文件上；
        }

        fr.close();
        fw.close();
    }

    private static void demo2() throws IOException {
        //字符流不能拷贝纯文本的文件
        FileReader fr = new FileReader("1.jpg");
        FileWriter fw = new FileWriter("copy3.jpg");

        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();
    }

    private static void demo1() throws IOException {
        FileReader fr = new FileReader("xxx.txt");
        FileWriter fw = new FileWriter("zzz.txt");

        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();             //writer类中有一个2K的小缓冲区，如果不关流，就会将内容写道缓冲区里，关流会将缓冲区里的内容刷新出来并关闭；
    }
}
