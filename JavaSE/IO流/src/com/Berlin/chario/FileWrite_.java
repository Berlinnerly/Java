package com.Berlin.chario;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/6 8:39
 */

/*

 */
public class FileWrite_ {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("yyy.txt");
        fw.write("大家好");

        fw.close();
    }
}
