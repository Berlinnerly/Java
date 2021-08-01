package com.Berlin.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/4 9:15
 */

/*
    判断功能：
        public boolean isDirectory();               判断是否是目录；
        public boolean isFile();                    判断是否是文件；
        public boolean exists();                    判断是否存在；
        public boolean canRead();                   判断是否可读；
        public boolean canWrite();                  判断是否可写；
        public boolean isHidden();                  判断是否隐藏；

 */
public class File_PanDuan_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        File file = new File("zzz");
        file.createNewFile();
        file.setReadable(false);
        System.out.println(file.canRead());             //true  Windows系统认为所有的文件都是可读的；
        file.setWritable(false);
        System.out.println(file.canWrite());            //Windows系统可以设置不可写；

        File file2 = new File("ccc.txt");
        System.out.println(file2.isHidden());               //判断是否隐藏
    }

    private static void demo1() {
        File dir = new File("ccc");
        System.out.println(dir.mkdir());
        System.out.println(dir.isDirectory());

        File dir2 = new File("aaa.txt");
        try {
            System.out.println(dir2.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(dir2.isFile());
    }
}
