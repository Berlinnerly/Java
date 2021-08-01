package com.berlin.collection1;

import java.util.ArrayList;
import java.util.Collection;
import com.berlin.bean.Student;

/*
    集合的遍历：
        就是依次获取集合中的每一个元素
    案例演示：
        把集合转成数组，可以实现集合的遍历
        toArray()
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class ToArray {
    public static void main(String[] args) {
//        demo1();
        Collection c = new ArrayList();
        c.add(new Student("张三",23));        //Object obj = new Student("张三",23) 类型提升
        c.add(new Student("李四",24));
        c.add(new Student("王五",25));
        c.add(new Student("赵六",26));

        Object[] arr = c.toArray();
        for (int i = 0; i < arr.length; i++) {
            Student s = (Student)arr[i];                    //向下转型
            System.out.println(s.getName() + "..." + s.getAge());

        }
    }

    public static void demo1() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        Object[] arr = c.toArray();                 //将集合转换成数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
