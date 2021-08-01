package com.berlin.StringBuffer;

/**
 * @Author Berlin
 * @Date 2021/1/11 14:01 星期一
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer heima = sb.append("heima");
        System.out.println(heima);

        heima.reverse();
        System.out.println(sb);

    }
}
