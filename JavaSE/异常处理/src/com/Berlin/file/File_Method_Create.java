package com.Berlin.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/4 8:40
 */

/*
    1.创建功能：
        public boolean createNewFile():     创建文件，如果存在这样的文件，就不创建了
        public boolean mkdir():             创建文件夹，如果存在这样的文件夹，就不创建了
        public boolean mkdirs():            创建文件夹，如果父文件夹不存在，会帮你创建出来

 */
public class File_Method_Create {
    public static void main(String[] args) throws IOException {
//        demo1();
        File dir1 = new File("aaa");
        System.out.println(dir1.mkdir());

        File dir2 = new File("ccc\\ddd");
        System.out.println(dir2.mkdirs());                  //创建多级文件夹
    }

    private static void demo1() throws IOException {
        File file = new File("yyy.txt");
        boolean b = file.createNewFile();
        System.out.println(b);

        File file2 = new File("zzz");
        System.out.println(file2.createNewFile());
    }
}
