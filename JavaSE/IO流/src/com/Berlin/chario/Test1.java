package com.Berlin.chario;

import java.io.*;
import java.util.ArrayList;

/**
 * @author Berlin
 * @Time 2020/11/6 9:36
 */

/*
    将一个文本文档上的文本反转，第一行和倒数第一行交换，第二行和倒数第二行交换；

    分析：
        1.创建输入输出流对象
        2.创建集合对象
        3.将独到的数据存储在集合中
        4.倒着遍历集合，将数据写道文件上；
        5.关流；

    注意事项：
        流对象尽量晚开早关；
 */
public class Test1 {
    public static void main(String[] args) throws IOException {
        //改写之后是尽量晚开早关
        //1.创建输入输出流对象
        BufferedReader br = new BufferedReader(new FileReader("password.txt"));

        //2.创建集合对象
        ArrayList<String> list = new ArrayList<>();

        //3.将独到的数据存储在集合中
        String line;
        while ((line = br.readLine()) != null) {
            list.add(line);
        }
        br.close();

        //4.倒着遍历集合，将数据写道文件上；
        BufferedWriter bw = new BufferedWriter(new FileWriter("ttt.txt"));
        for (int i = list.size() -1; i >= 0;i--) {
            bw.write(list.get(i));
            bw.newLine();
        }

        //5.关流；
//        br.close();
        bw.close();
    }
}
