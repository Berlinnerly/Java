package com.Berlin.chario;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

/**
 * @author Berlin
 * @Time 2020/11/6 10:01
 */

/*

 */
public class LineNumberReader_ {
    public static void main(String[] args) throws IOException {
        LineNumberReader lnr = new LineNumberReader(new FileReader("password.txt"));

        String line;
        lnr.setLineNumber(100);
        while ((line = lnr.readLine()) != null) {
            System.out.println(lnr.getLineNumber() + ":" + line);
        }

        lnr.close();
    }
}
