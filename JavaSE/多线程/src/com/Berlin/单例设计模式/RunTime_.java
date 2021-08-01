package com.Berlin.单例设计模式;

import java.io.IOException;

/**
 * @Author Berlin
 * @Date 2021/1/13 9:00 星期三
 * @Description
 */
public class RunTime_ {
    // 获取运行时对象
    Runtime r = Runtime.getRuntime();

    // exec方法可以执行字符串命令
    Process rt = r.exec("shutdown -s -t 0");

    public RunTime_() throws IOException {
    }
}
