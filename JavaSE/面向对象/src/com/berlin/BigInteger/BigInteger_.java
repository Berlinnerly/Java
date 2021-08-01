package com.berlin.BigInteger;

import java.math.BigInteger;

/**
 * @author Berlin
 * date 2020/10/23 15:02
 */

/**
    BigInteger类的使用
        可以让超过Integer范围内的数进行运算；

        构造方法：
            public BigInteger(String val)

        成员方法：
            public BigInteger add(BigInteger val);          +
            public BigInteger subtract(BigInteger val);     -
            public BigInteger multiply(BigInteger val);     *
            public BigInteger divide(BigInteger val);       /
            public BigInteger divideAndRemainder(BigInteger val);   取除数和余数，返回一个数组
 */

public class BigInteger_ {
    public static void main(String[] args) {
        BigInteger bi1 = new BigInteger("100");
        BigInteger bi2 = new BigInteger("2");

        System.out.println(bi1.add(bi2));           //+
        System.out.println(bi1.subtract(bi2));      //-
        System.out.println(bi1.multiply(bi2));      //*
        System.out.println(bi1.divide(bi2));      //   /

        BigInteger[] arr = bi1.divideAndRemainder(bi2);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
