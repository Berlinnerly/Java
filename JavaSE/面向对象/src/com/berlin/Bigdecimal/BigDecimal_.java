package com.berlin.Bigdecimal;

import java.math.BigDecimal;

/**
 * @author Berlin
 * date 2020/10/23 15:29
 */

/*
    为了更精确的存储小数；
    构造：
        public BigDecimal(String val)

    方法：
        // 将一个BigDecimal的数与另一个BigDecimal的数相加
        public BigDecimal add(BigDecimal augend)

        // 将一个BigDecimal的数与另一个BigDecimal的数相减
        public BigDecimal subtract(BigDecimal subtract)

        // 将一个BigDecimal的数与另一个BigDecimal的数相乘
        public BigDecimal multiply(BigDecimal multiplicand)

        // 将一个BigDecimal的数与另一个BigDecimal的数相除
        public BigDecimal divide(BigDecimal divisor)
 */
public class BigDecimal_ {
    public static void main(String[] args) {
//        BigDecimal bd1 = new BigDecimal(2.0);     在开发中不建议使用，不够精确
//        BigDecimal bd2 = new BigDecimal(1.1);
//
//        System.out.println(bd1.subtract(bd2));

        BigDecimal bd1 = new BigDecimal("2.0");     //通过构造中传入字符串的方式，开发时推荐
        BigDecimal bd2 = new BigDecimal("1.1");
        System.out.println(bd1.subtract(bd2));

        BigDecimal bd3 = BigDecimal.valueOf(2.0);       //这种方式在开发中也是推荐的
        BigDecimal bd4 = BigDecimal.valueOf(1.1);
        System.out.println(bd3.subtract(bd4));

    }
}
