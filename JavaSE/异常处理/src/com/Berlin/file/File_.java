package com.Berlin.file;

import java.io.File;

/**
 * @author Berlin
 * @Time 2020/11/3 17:12
 */

/*
    File(String pathname):      根据一个路径得到File对象；
    File(String parent, String child)       根据一个目录和一个子文件/目录得到File对象
    File(File parent, String child)         根据一个父File对象和一个子文件夹/目录得到File对象
 */
public class File_ {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        File parent = new File("D:\\");
        String child = "liupanshui.7z";
        File file = new File(parent, child);
        System.out.println(file.exists());
    }

    private static void demo2() {
        String parent = "D:\\";
        String child = "liupanshui.7z";
        File file = new File(parent,child);
        System.out.println(file.exists());
    }

    private static void demo1() {
        File file = new File("D:\\liupanshui.7z");
        System.out.println(file.exists());
    }
}
