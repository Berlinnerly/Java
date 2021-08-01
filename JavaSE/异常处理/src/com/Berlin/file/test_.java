package com.Berlin.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * @author Berlin
 * @Time 2020/11/4 10:25
 */

/*
    需求：
        判断E盘下是否有后缀名为.jpg的文件，如果有，输出该名称；
 */
public class test_ {
    public static void main(String[] args) {
        File dir = new File("E:\\");
//        String[] arr = dir.list();              //获取所有的文件或文件夹
//        for (String string : arr) {
//            if (string.endsWith(".jpg")) {
//                System.out.println(string);
//            }
//        }

//        File[] subFiles = dir.listFiles();
//
//        for (File subFile : subFiles) {
//            if (subFile.isFile() && subFile.getName().endsWith(".jpg")) {
//                System.out.println(subFile);
//            }
//        }

        String[] arr = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir, name);
                return file.isFile() && file.getName().endsWith(".jpg");
            }
        });
        for (String string : arr) {
            System.out.println(string);
        }
    }
}
