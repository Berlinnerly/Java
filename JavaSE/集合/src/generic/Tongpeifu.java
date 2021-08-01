package generic;

import com.berlin.bean.Person;
import com.berlin.bean.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Berlin
 * @Time 2020/10/28 9:16
 */

/*
        泛型通配符<?>
            任意类型：如果没有明确，那么就是Object以及任意的Java类了
        ？ extends E
            向下限定，E及其子类
        ？ super E
            向上限定，E及其父类
 */
public class Tongpeifu {
    public static void main(String[] args) {
//        List<?> list = new ArrayList<String>();     //当右边的泛型不确定时，左边可以指定为？
        ArrayList<Student> list1 = new ArrayList<>();
        list1.add(new Student("张三",23));
        list1.add(new Student("李四",24));
        list1.add(new Student("王五",25));

        ArrayList<Person> list2 = new ArrayList<>();
        list2.add(new Person("赵六",26));
        list2.add(new Person("刘八",27));

        list1.addAll(list2);
        System.out.println(list1);

//        list2.addAll(list1);
//        System.out.println(list2);
    }
}
