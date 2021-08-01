package com.Berlin.exception;

/**
 * @author Berlin
 * @Time 2020/11/3 15:46
 */

/*
    finally的特点：
        被finally控制的语句体一定会执行；
        特殊情况：在执行到finally之前jvm推出了（比如：System.exit(0)）;
    finally的作用：
        用于释放资源，在IO流操作和数据库操作中会见到；
 */
public class Finally_ {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("除数为0了");
            System.exit(0);                     //推出Java虚拟机
            return;                                 //加了return之后，finally依然会执行
        } finally {
            System.out.println("看看我执行了吗");
        }
    }
}
