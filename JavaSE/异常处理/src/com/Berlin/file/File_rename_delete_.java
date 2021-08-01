package com.Berlin.file;

import java.io.File;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/4 8:59
 */

/*
    1.重命名和删除功能：
        public boolean renameTo(File dest):             把文件重命名为指定的文件路径；
        public boolean delete():                        删除文件或文件夹；           只能删除空文件夹
    2.重命名注意事项：
        1.如果路径名不同，就是改名并剪切；
        2.如果路径名相同，就是改名；
    3.删除注意事项：
        Java中的删除不走回收站；
        要删除一个文件夹，请注意该文件夹内不能包含文件或文件夹；

 */
public class File_rename_delete_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        File file1 = new File("yyy.txt");
        file1.createNewFile();
        System.out.println(file1.delete());

        File file2 = new File("aaa");
        System.out.println(file2.mkdir());
        System.out.println(file2.delete());
    }

    private static void demo1() throws IOException {
        File file1 = new File("ooo.txt");
        file1.createNewFile();

        File file2 = new File("D:\\ooo.txt");
        file1.renameTo(file2);
    }
}
