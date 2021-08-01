package com.Berlin.thread;

import java.io.IOException;

/**
 * @author Berlin
 * @Time 2020/11/9 16:40
 */

/*

 */
public class RunTime_ {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();           //获取运行时对象
//        r.exec("shutdown -s -t 300");
        r.exec("shutdown -a");
    }
}
