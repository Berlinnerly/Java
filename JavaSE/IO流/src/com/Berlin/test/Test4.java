package com.Berlin.test;

import java.io.File;

/**
 * @author Berlin
 * @Time 2020/11/9 8:54
 */

/*
    从键盘接受一个文件夹路径，把文件夹中的所有文件以及文件夹的名字按层级打印；

    把文件夹中的所有文件以及文件夹的名字按层级打印
        1.获取所有的文件和文件夹，返回的是一个File数组；
        2.遍历数组；
        3.无论是文件还是文件夹都需要直接打印；
        4.如果是文件夹，递归调用；

 */
public class Test4 {
    public static void main(String[] args) {
        File dir = Test1.getDir();              //获取文件夹路径
        printLev(dir, 0);
    }

    public static void printLev(File dir, int lev) {
        //1.获取所有的文件和文件夹，返回的是一个File数组；
        File[] subFiles = dir.listFiles();
        //2.遍历数组；
        for (File subFile : subFiles) {
            for (int i = 0; i <= lev; i++) {
                System.out.print("\t");
            }
            //3.无论是文件还是文件夹都需要直接打印；
            System.out.println(subFile);
            //4.如果是文件夹，递归调用；
            if (subFile.isDirectory()) {
                printLev(subFile, lev + 1);
            }
        }
    }
}
