package DuoTai;

/*
    多态的概述（polymorphic）
        事物存在的多种形态

    多态的前提
        1.要有继承关系；
        2.要有方法重写；
        3.要有父类引用子类对象；

    多态中的成员访问特点之成员变量
        成员变量：
            编译看左边（父类），运行看左边（父类）
    多态中的成员访问特点之成员方法
        成员方法:
            编译看左边（父类），运行看右边（子类）动态绑定
    多态中的成员访问特点之静态成员方法
        静态方法：
            编译看左边（父类），运行看左边（父类）
            （静态和类相关，算不上重写，所以访问还是左边的）
    总结：只有非静态的成员方法，编译看左边，运行看右边

    多态的好处和弊端
        多态的好处：
            1.提高了代码的维护性；（继承保证）
            2.提高了代码的扩展性；（多态保证）

        多态的弊端：
            不能使用子类特有的属性和行为；

    a instanceof b          //判断a是不是b类型，
 */
public class DuoTai {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.eat();
        System.out.println(c.num);

        Animal a = new Cat();                   //父类引用子类对象
        a.eat();                                //父类引用子类方法
        System.out.println(a.num);
        Animal.method();                        //相当于Animal.method();
    }
}

class Animal {
    int num = 10;

    public static void method() {
        System.out.println("Animal static method");
    }

    public void eat() {
        System.out.println("动物吃饭");
    }
}

class Cat extends Animal {
    int num = 20;

    public static void method() {
        System.out.println("Cat static method");
    }

    public void eat() {
        System.out.println("猫吃鱼");
    }
}
