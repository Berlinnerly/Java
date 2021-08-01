package com.Berlin.模板设计模式;

/**
 * @author Berlin
 * @Time 2020/11/13 13:12
 */

/*
    模板设计模式就是定义一个算法的骨架，而将具体的算法延迟到子类中来实现

    优点：
        使用模板设计模式，在定义算法骨架的同时，可以很灵活的实现具体的算法，满足用户灵活多变的需求

    缺点：
        如果算法骨架有修改的话，则需要修改抽象类
 */
public class Template_ {
    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        for (int i = 0; i < 1000000; i++) {
//            System.out.println("x");
//        }
//        long end = System.currentTimeMillis();
//        System.out.println(end - start);

        Demo d = new Demo();
        System.out.println(d.getTime());

    }
}

abstract class GetTime {
    public final long getTime() {
        long start = System.currentTimeMillis();
        code();
        long end = System.currentTimeMillis();
        System.out.println(end - start);
        return end - start;
    }

    public abstract void code();
}

class Demo extends GetTime {
    @Override
    public void code() {
        int i = 0;
        while (i < 100000) {
            System.out.println("x");
            i++;
        }
    }
}
