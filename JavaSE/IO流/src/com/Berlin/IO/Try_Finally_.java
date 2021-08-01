package com.Berlin.IO;

import java.io.*;

/**
 * @author Berlin
 * @Time 2020/11/5 14:27
 */

/*

 */
public class Try_Finally_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        try (
                FileInputStream fis = new FileInputStream("xxx.txt");
                FileOutputStream fos = new FileOutputStream("yyy.txt");
                Myclose mc = new Myclose();
        ) {
            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        }
    }

    private static void demo1() throws IOException {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("xxx.txt");
            fos = new FileOutputStream("yyy.txt");

            int b;
            while ((b = fis.read()) != -1) {
                fos.write(b);
            }
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } finally {                 //try finally的嵌套，目的是能关一个尽量关一个；
                if (fos != null)
                    fos.close();
            }
        }
    }
}

class Myclose implements AutoCloseable {
    public void close() {
        System.out.println("我关了");
    }
}
