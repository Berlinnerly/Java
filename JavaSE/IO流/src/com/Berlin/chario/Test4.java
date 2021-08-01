package com.Berlin.chario;

import java.io.File;
import java.util.Scanner;

/**
 * @author Berlin
 * @Time 2020/11/6 14:13
 */

/*
    从键盘录入接收一个文件夹路径，打印出该文件夹下所有的.java文件名

    分析：
        从键盘接收一个文件夹路径
            1.如果录入的是不存在的路径，给予提示
            2.如果是文件路径，给予提示；
            3.如果是文件夹路径，直接返回；

        打印出该文件夹下所有的.java文件名
            1.获取到该文件夹路径下的所有文件和文件夹，存储在file数组中
            2.遍历数组，对每一个文件或文件夹做判断
            3.如果是文件，并且后缀是.java的，就打印；
            4.如果是文件夹就递归调用
 */
public class Test4 {
    public static void main(String[] args) {
        File dir = getdir();
        printJavaFile(dir);
    }

    /*
        获取键盘录入的文件夹路径
            1.返回值类型：File
            2.不需要参数
     */
    public static File getdir() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个文件夹路径：");
        while (true) {
            String line = sc.nextLine();
            File dir = new File(line);              //封装成file对象
            if (!dir.exists()) {
                System.out.println("您录入的文件夹路径不存在，请重新录入");
            } else if (dir.isFile()) {
                System.out.println("您录入的是文件路径，请重新录入文件夹路径：");
            } else {
                return dir;
            }
        }
    }

    /*
        获取文件夹路径下的所有.java文件
            1.返回值类型：void
            2.参数列表：File dirf
     */
    public static void printJavaFile(File dir) {
        //1.获取到该文件夹路径下的所有文件和文件夹，存储在file数组中
        File[] subFile = dir.listFiles();
        //2.遍历数组，对每一个文件或文件夹做判断
        for (File subfile : subFile) {
            //3.如果是文件，并且后缀是.java的，就打印；
            if (subfile.isFile() && subfile.getName().endsWith(".java")) {
                System.out.println(subfile);
                //4.如果是文件夹就递归调用
            } else if (dir.isDirectory()) {
                printJavaFile(subfile);
            }
        }
    }
}