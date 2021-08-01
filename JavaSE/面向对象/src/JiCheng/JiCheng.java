package JiCheng;

/*
    继承（extends）:让类于类之间产生关系；子父类关系

    继承的好处和弊端：
        好处：1.提高了代码的复用性；
             2.提高了代码的维护性；
             3.让类于类之间产生了关系，是多态的前提；

        弊端：类的耦合性增强了；（紧密程度太紧密了）

        开发的原则：高内聚，低耦合
            内聚：自己完成某件事情的能力；
            耦合：类于类之间的关系

    继承的特点：
        1.只支持单继承，不支持多继承,但支持多层继承（python支持多继承）
        2.如果想用这个体系的所有功能，用最底层的类创建对象；
        3.如果想看这个体系的共性功能，看最顶层的类；

    继承的注意事项：
        1.子类只能继承父类的所有非私有的成员（成员方法和成员变量）
        2.子类不能继承父类的构造方法，但可以通过super关键字去访问父类构造方法；
        3.不要为了部分功能去继承。

    什么时候用继承：
        继承体现的是一种关系：“is a”
        采用假设法：如果有两个类A，B。只有他们符合A是B的一种，或者B是A的一种就可以考虑使用继承。

    继承中成员变量的关系:(就近原则，子类有的，就不会用父类的)

    this和super的区别：
        1.this代表当前对象的引用；谁来调用我，我就代表谁。
          super代表当前父类的引用。
        2.区别：
            1.成员变量：
                this.成员变量 调用的是本类的成员变量，也可以调用父类的成员变量。
                super.成员变量 调用父类的成员变量。
            2.调用构造方法：
                this（。。。） 调用本类的构造方法；
                super（。。。） 调用父类的构造方法。
            3.调用成员方法：
                this.成员方法： 调用本类的成员方法,也可以调用父类的成员方法（本类没有的情况下）。
                super.成员方法  调用父类的成员方法。

            子类中所有的构造方法默认都会访问父类中空参的构造方法；因为子类会继承父类中的数据，可能还会使用父类中的数据，所以子类初始化之前
            一定要先完成父类数据的初始化。
            super(...)或者this(...)必须出现在构造方法的第一条语句上。
    方法重写注意事项：
        1.父类中私有方法不能被重写；
            因为父类私有方法子类根本就无法继承；
        2.子类重写父类方法时，访问权限不能更低；
            最好一致
        3.父类静态方法，子类也必须通过静态方法进行重写；

            子类重写父类方法时，声明最好一样

        方法重写:子类中出现了和父类声明一样的方法，与返回值类型有关，返回值是一致的（或者是子父类的）
        方法重载：本类中出现的方法名一样，参数列表不同的方法，与返回值类型无关。
        子类对象在调用方法的时候，先找子类本身，再找父类。

    final概述：
        final修饰特点
            修饰类：类不能被继承；
            修饰变量：变量变成了常量，只能被赋值一次；
            修饰方法：方法不能被重写；

        final关键字修饰局部变量
            基本类型，是值不能被改变；
            引用数据类型，是地址值不能被改变；

        final修饰的变量初始化的时机
            显示初始化；
            在对象构造完毕前即可。
 */
public class JiCheng {
    public static void main(String[] args) {
//        Cat c = new Cat();
//        c.color = "hong";
//        c.leg = 4;
//        c.eat();
//        c.sleep();
//        System.out.println(c.leg + "..." + c.color);
        Son r = new Son();
        r.print();

    }
}

class Animal {
    String color;
    int leg;

    public void eat() {

        System.out.println("吃饭");
    }

    public void sleep() {

        System.out.println("睡觉");
    }
}

class Cat extends Animal {

}

//final class Father {                            //使用final关键字修饰类，类不能被继承
//    public  final void print() {                //使用final关键字修饰干法，这个方法就不能被子类重写
//        System.out.println("访问底层数据资源");
//    }
//}

class Son /*extends Father*/ {
    public static final int NUM_VALUE = 10;                       //常量的命名规范     final一般会跟public static公用

    public void print() {
//        num = 20;                                 //使用final关键字修饰变量，变量不能被更改
        System.out.println(NUM_VALUE);
    }
}

class Demo {
    final int num;                                //final修饰的变量的默认初始化值是无效值

    public Demo() {
        num = 10;                                   //构造对象必须走构造方法，所以在对象构造完毕之前赋值是可以的
    }

    public void print() {
        System.out.println(/*num*/);
    }
}