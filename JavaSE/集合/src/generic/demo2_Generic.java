package generic;

import com.berlin.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Berlin
 * @Time 2020/10/27 17:31
 */

/*
    ArrayList存储字符串并遍历泛型版
 */
public class demo2_Generic {
    public static void main(String[] args) {
//        demo1();
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("张三",23));
        list.add(new Student("李四",24));
        list.add(new Student("王五",25));

        //集合中的每一个元素用Student记录
        for (Student s : list) {
            System.out.println(s.getName() + "..." + s.getAge());

        }
    }

    public static void demo1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
