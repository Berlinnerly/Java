package com.Berlin.chario;

import java.io.*;

/**
 * @author Berlin
 * @Time 2020/11/6 10:22
 */

public class ZhuanHuanLiu_ {
    //用默认的编码表读写，出现乱码
    public static void main(String[] args) throws IOException {
//        demo1();
//        demo2();
        //更高效的读写
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("utf-8.txt"),"utf-8"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk"));

        int c ;
        while ((c = br.read()) != -1) {
            bw.write(c);
        }

        br.close();
        bw.close();
    }

    private static void demo2() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("utf-8.txt"), "utf-8");   //指定码表读字符
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gbk.txt"),"gbk");     //指定码表写字符

        int c;
        while ((c = isr.read()) != -1) {
            osw.write(c);
        }
        isr.close();
        osw.close();
    }

    private static void demo1() throws IOException {
        FileReader fr = new FileReader("utf-8.txt");
        FileWriter fw = new FileWriter("gbk.txt");

        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }

        fr.close();
        fw.close();
    }
}
