package com.berlin.collection1;

import com.berlin.bean.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
    迭代：
        集合是用来存储元素的，存储的元素需要查看，就需要迭代（遍历）

    原理：
        迭代器是对集合进行遍历，而每一个集合内部的存储结构都是不同的，所以每一个集合存和取都是不一样的，就需要在每一个类中定义hasnext()
        和next()方法，这样做是可以的，但是会让整个集合体系过于臃肿，迭代器是将这样的方法向上抽取出接口，然后再每个类的内部定义自己的迭代方法
        ，好处：1.规定了整个集合体系的遍历方式都是hasnext()和next(),2.代码由底层内部实现，使用者不用管怎么实现的，会用即可。

 */
public class Diedai {
    public static void main(String[] args) {
//        demo1();
        Collection c = new ArrayList();
        c.add(new Student("张三", 23));
        c.add(new Student("李四", 24));
        c.add(new Student("王五", 25));
        c.add(new Student("赵六", 26));

        //自定义对象的迭代
        Iterator it = c.iterator();
        while (it.hasNext()) {
            Student s = (Student) it.next();         //向下转型
            System.out.println(s.getName() + "..." + s.getAge());
        }
    }

    public static void demo1() {
        Collection c = new ArrayList();
        c.add("a");
        c.add("b");
        c.add("c");
        c.add("d");

        //对集合中的元素进行迭代（遍历）
        Iterator it = c.iterator();         //获取迭代器
/*        boolean b1 = it.hasNext();          //判断集合中是否有元素
        Object obj = it.next();
        System.out.println(b1);
        System.out.println(obj);

        boolean b2 = it.hasNext();          //判断集合中是否有元素
        Object ob2 = it.next();
        System.out.println(b2);
        System.out.println(ob2);
*/

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
