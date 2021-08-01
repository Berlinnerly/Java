package com.Berlin.otherIO;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author Berlin
 * @Time 2020/11/8 22:07
 */

/*

 */
public class SystemIn_ {
    public static void main(String[] args) throws IOException {
/*        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       //InputStreamReader转换流
        String line = br.readLine();
        System.out.println(line);
        br.close();*/

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        System.out.println(line);
        sc.close();
    }
}
