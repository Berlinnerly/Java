package com.Berlin.thread;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Berlin
 * @Time 2020/11/9 16:50
 */

/*

 */
public class Timer_ {
    public static void main(String[] args) throws InterruptedException {
        Timer t = new Timer();
        //在指定时间安排指定任务
        //第一个参数是安排的任务，第二个参数是执行的时间，第三个参数是过多久以后重复
        t.schedule(new MyTimerTask(), new Date(120, 10, 9, 14, 58, 30));

        while (true) {
            Thread.sleep(1000);
            System.out.println(new Date());
        }
    }
}

class MyTimerTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("起床背单词");
    }
}
