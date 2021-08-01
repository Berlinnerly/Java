package com.Berlin.reflect;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;

interface Fruit {
    void squeeze();
}

/**
 * @author Berlin
 * @Time 2020/11/13 9:43
 */

/*
    榨汁机榨汁的实例
    分别有水果（fruit）苹果（apple）香蕉（Banana）橘子（Orange）榨汁（squeeze）
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        //多态
//        Juicer j = new Juicer();
//        j.run(new Apple());

        //反射和配置文件
        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        Fruit f = (Fruit) clazz.newInstance();          //父类引用指向子类对象，水果引用指向了苹果对象
    }
}

class Apple implements Fruit {
    public void squeeze() {
        System.out.println("榨出一杯苹果汁");
    }
}

class Orange implements Fruit {
    public void squeeze() {
        System.out.println("榨出一杯橘子汁");
    }

    public void HaHa() {
        InputStream in = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

    }

    class Juicer {
//    public void run(Apple a) {
//        a.squeeze();
//    }
//
//    public void run(Orange o) {
//        o.squeeze();
//    }
        public void run(Fruit f) {
            f.squeeze();
        }
    }
}
