package com.Berlin.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Berlin
 * @Time 2020/11/4 9:37
 */

/*
    获取功能：
        public String getAbsolutePath();            获取绝对路径；
        public String getPath();                    获取路径；
        public String getName();                    获取名称；
        public long length();                       获取长度，字节数；
        public long lastModified();                 获取最后一次的修改时间，毫秒值；
        public String[] list();                     获取指定目录下的所有文件或文件夹的名称数组；
        public file[] listFiles();                  获取指定目录下的所有文件或文件夹的File数组；
 */
public class File_HuoQu_ {
    public static void main(String[] args) {
//        demo1();
        File dir = new File("E:\\Java学习视频资料\\Java第一阶段\\day19异常\\video");
        String[] arr = dir.list();                                              //仅为了获取文件名

        for (String d : arr) {
            System.out.println(d);
        }

        System.out.println("-------------------------------------------------------------------");

        File[] subFiles = dir.listFiles();                                      //获取文件对象
        for (File f : subFiles) {
            System.out.println(f);
        }

    }

    private static void demo1() {
        File file = new File("ccc.txt");
        System.out.println(file.getAbsolutePath());             //获取绝对路径

        System.out.println(file.getPath());             //获取构造方法里传入的路径

        System.out.println(file.getName());             //获取文件或文件夹名称

        System.out.println(file.length());              //获取字节个数

        System.out.println(file.lastModified());        //获取最后一次修改时间

        Date d = new Date(file.lastModified());
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        System.out.println(sdf.format(d));
    }
}
