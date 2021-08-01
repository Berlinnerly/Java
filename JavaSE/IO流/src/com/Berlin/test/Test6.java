package com.Berlin.test;

import java.math.BigInteger;

public class Test6 {

    /**
     * @param args 求出1000的阶乘所有0和尾部0的个数，不用递归
     */
    public static void main(String[] args) {
		/*int result = 1;
		for(int i = 1; i <= 1000; i++) {
			result = result * i;
		}
		
		System.out.println(result);
		*/
        //demo1();
        demo2();
    }

    public static void demo2() {
        BigInteger bi1 = new BigInteger("1");
        for (int i = 1; i <= 1000; i++) {
            BigInteger bi2 = new BigInteger(i + "");
            bi1 = bi1.multiply(bi2);
        }
        String str = bi1.toString();
        StringBuilder sb = new StringBuilder(str);
        str = sb.reverse().toString();

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('0' != str.charAt(i)) {
                break;
            } else {
                count++;
            }
        }

        System.out.println(count);
    }

    public static void demo1() {
        BigInteger bi1 = new BigInteger("1");
        for (int i = 1; i <= 1000; i++) {
            BigInteger bi2 = new BigInteger(i + "");
            bi1 = bi1.multiply(bi2);
        }
        String str = bi1.toString();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('0' == str.charAt(i)) {
                count++;
            }
        }
        System.out.println(count);
    }

}
