package generic;

import com.berlin.bean.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Berlin
 * @Time 2020/10/27 16:50
 */

/*
    泛型的好处：
        1.提高了安全性（将运行期的错误转换到编译期）
        2.省去强转的麻烦
    泛型的基本使用：
        <>中放的必须是引用数据类型
    使用注意事项：
        前后的泛型必须一致，或者后面的泛型可以省略不写
 */
public class Generic_ {
    public static void main(String[] args) {
//        demo1();
//        ArrayList<Object> list = new ArrayList<Student>();        集合的泛型要保证前后的数据类型一致
        ArrayList<Object> list = new ArrayList<>();         //泛型最好不要定义成Object，没有意义
        list.add("aaa");
        list.add(true);
    }

    public static void demo1() {
        ArrayList<Student> list = new ArrayList<Student>();
//        list.add(110);
//        list.add(true);
        list.add(new Student("张三",23));

        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
//            System.out.println(it.next());
            Student s = it.next();
            System.out.println(s.getName() + "..." + s.getAge());
        }
    }
}
