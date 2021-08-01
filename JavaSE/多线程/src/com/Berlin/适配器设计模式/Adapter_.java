package com.Berlin.适配器设计模式;

/**
 * @Author Berlin
 * @Date 2021/1/13 10:19 星期三
 * @Description
 *
 *
 */
public class Adapter_ {
    public static void main(String[] args) {

    }
}

interface 和尚 {
    public void 打坐();
    public void 念经();
    public void 撞钟();
    public void 习武();
}

// 声明抽象的原因，不让其他类创建本类对象,都是空方法
abstract class 天罡星 implements 和尚 {

    @Override
    public void 打坐() {

    }

    @Override
    public void 念经() {

    }

    @Override
    public void 撞钟() {

    }

    @Override
    public void 习武() {

    }
}

class 鲁智深 extends 天罡星 {
    @Override
    public void 习武() {
        System.out.println("倒把垂杨柳");
    }
}