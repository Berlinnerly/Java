package com.berlin.模板设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 22:59
 * @description
 */
public abstract class GetTime {
    public final long getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        return end - start;
    }

    public abstract void code();
}
