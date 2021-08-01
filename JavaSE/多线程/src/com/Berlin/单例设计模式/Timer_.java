package com.Berlin.单例设计模式;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author Berlin
 * @Date 2021/1/13 9:09 星期三
 * @Description
 */
public class Timer_ {
    public static void main(String[] args) {
        Timer t = new Timer();

        // 在指定时间执行指定任务
        /**
         * 参数一：要执行的任务
         * 参数二：开始执行的时间
         * 参数三：过多久后重复执行
         */
        t.schedule(new myTimerTask(), new Date(188, 6, 1, 14, 20, 30));
    }
}

class myTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("起床");
    }
}
