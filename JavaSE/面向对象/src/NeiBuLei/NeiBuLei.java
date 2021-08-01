package NeiBuLei;

import java.util.Scanner;

/*
    内部类的概述
        在类中定义类
    访问的特点
        1.内部类可以直接访问外部类的成员，包括私有；
        2.外部类要访问内部类的成员，必须创建对象；
        3.外部类名.内部类名 对象名 = 外部类对象.内部类对象；

    局部内部类访问局部变量
        局部内部类：方法中定义的内部类

        局部内部类访问局部变量必须使用final修饰

    匿名内部类
        就是内部类的简化写法

        前提：存在一个类或接口（可以是具体类也可以是抽象类）

        格式：
            new 类名或者接口名（） {
            重写方法
            }
        本质是一个继承了该类或者实现了该接口的子类匿名对象

    匿名内部类只针对重写一个方法时使用
    匿名内部类是不能向下转型的，因为没有子类类名

 */
public class NeiBuLei {
    public static void main(String[] args) {
//        Inner i = new Inner();                不能直接创建内部类对象
//        Outer.Inner oi = new Outer().new Inner();           //创建内部类对象
//        oi.method();
        Outer1 o = new Outer1();
        o.method();

        Scanner sc = new Scanner(System.in);

    }
}

class Outer {
    private final int num = 10;

    public void print() {                           //如果内部类被私有，可以使用这种方法访问
        Inner i = new Inner();
        i.method();
    }

    private class Inner {
        public void method() {
            System.out.println(num);
        }
    }
}

//局部内部类,只能在其所在的方法中访问
class Outer1 {
    public void method() {
        class Inner {
            public void print() {
                System.out.println("HelloWorld");
            }
        }
        Inner i = new Inner();
        i.print();
    }
}


class Student {
    private String name;
    private int age;

    public Student() {
        super();
    }


}