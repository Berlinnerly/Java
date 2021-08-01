package generic;

import com.berlin.bean.Person;
import com.berlin.bean.Tool;
import com.berlin.bean.Worker;

/**
 * @author Berlin
 * @Time 2020/10/27 17:41
 */

/*
    泛型的由来：
        早期的Object类型可以接收任意的对象类型，但是在是实际使用中，会有类型转换问题，存在隐患，所以Java提供了泛型来解决。

 */
public class demo3_Generic {
    public static void main(String[] args) {
//        demo1();
        Tool<String> t = new Tool<>();
        t.show(true);

    }

    public static void demo1() {
        Tool<Person> t = new Tool<>();                    //创建工具类对象
        t.setObj(new Person("张三",23));

//        Worker w = (Worker) t.getObj();         //向下转型
//        System.out.println(w);
    }
}
