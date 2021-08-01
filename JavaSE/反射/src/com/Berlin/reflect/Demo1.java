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
    ե֭��ե֭��ʵ��
    �ֱ���ˮ����fruit��ƻ����apple���㽶��Banana�����ӣ�Orange��ե֭��squeeze��
 */
public class Demo1 {
    public static void main(String[] args) throws Exception {
        //��̬
//        Juicer j = new Juicer();
//        j.run(new Apple());

        //����������ļ�
        BufferedReader br = new BufferedReader(new FileReader("config.properties"));
        Class clazz = Class.forName(br.readLine());
        Fruit f = (Fruit) clazz.newInstance();          //��������ָ���������ˮ������ָ����ƻ������
    }
}

class Apple implements Fruit {
    public void squeeze() {
        System.out.println("ե��һ��ƻ��֭");
    }
}

class Orange implements Fruit {
    public void squeeze() {
        System.out.println("ե��һ������֭");
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
