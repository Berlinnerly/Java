package JieKou;

interface Inter {
    int num = 10;                           //接口中的变量默认都是用final修饰的，是常量

    void print();           //接口中的方法都是抽象的
//    public Inter() {}                     //接口中没有构造方法
//    public void print() {}                //接口中只能是抽象方法

}

/*
    接口：
        狭义：指Java中的interface
        广义：对外提供规则的都是接口
    接口特点：
        1.接口用关键字interface表示
            interface 接口名 {}
        2.类实现接口用implements表示
            class 类名 implement 接口名 {}
        3.接口不能实例化
        4.接口的子类
            可以是抽象类，但意义不大
            可以是具体类，要重写接口中的所有抽象方法；（推荐）

    接口成员的特点
        成员变量只能是常量，并且是静态公共的；
        默认修饰符：public static final
        建议自己手动给出

        构造方法：接口没有构造方法；
        成员方法：只能是抽象方法；
                 默认修饰符public abstract           三个关键字可以相互交换位置，没有顺序，建议手动给出
                 建议自己手动给出

     类与类，类与接口，接口与接口之间的关系
        类与类：
            继承关系，只能单继承，可以多层继承
        类与接口：
            实现关系，可以单实现，也可以多实现；
        接口与接口：
            继承关系，可以单继承，也可以多继承；

    抽象类和接口的区别：
        1.成员区别：
            抽象类：
                成员变量：可以变量，也可以常量；
                构造方法：有；
                成员方法：可以抽象，也可以非抽象；
            接口：
                成员变量：只可以常量；
                成员方法：只可以抽象；

        2.关系区别：
            类与类：
                继承，单继承；
            类与接口：
                实现，单实现，多实现；
            接口与接口：
                继承，单继承，多继承；

        3.设计理念区别：
            抽象类： 被继承体现的是“is a”的关系，抽象类中定义的是该继承体系的共性功能；
            接口： 被实现体现的是“like a”的关系，接口中定义的是该继承体系的扩展功能
 */
public class Jiekou {
    public static void main(String[] args) {
//        Inter i = new Inter();            //接口不能被实例化
        Inter i = new Demo();               //父类引用只想子类对象
        i.print();
        System.out.println(Inter.num);      //接口中的变量默认是用static修饰的，可以用类名.访问
    }
}

class Demo implements Inter {
    //    num = 20;                             //
    public void print() {
        System.out.println(num);
    }
}
