package com.berlin.模板设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 23:03
 * @description
 */
public class Test extends GetTime {
    @Override
    public void code() {
        int i = 0;
        while (i < 10000) {
            System.out.println("x");
            i++;
        }
    }
}
