package com.Berlin.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Berlin
 * @Time 2020/11/9 23:30
 */

/*
    public static ExecutorService newFixedThreadPool(int nThreads)
    public static ExecutorService newSingleThreadExecutor()
 */
public class Executors_ {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);     //创建线程池
        pool.submit(new MyRunnable2());         //将线程放进池子里并执行
        pool.submit(new MyRunnable2());

        pool.shutdown();            //关闭线程池
    }
}
