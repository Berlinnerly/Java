package com.Berlin.otherIO;

import com.Berlin.bean.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author Berlin
 * @Time 2020/11/8 20:50
 */

/*
    序列化：将对象写到文件上
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) throws IOException {
//        demo1();
        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",24);
        Person p3 = new Person("王五",25);
        Person p4 = new Person("赵六",26);

        ArrayList<Person> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));

        oos.writeObject(list);
        oos.close();
    }

    private static void demo1() throws IOException {
        Person p1 = new Person("张三",23);
        Person p2 = new Person("李四",24);

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e.txt"));
        oos.writeObject(p1);
        oos.writeObject(p2);
    }
}
