package ChouXiangLei;

/*
    具体事物；猫，狗；
    共性：姓名，年龄，吃饭；
    猫的特性：抓老鼠；
    狗的特性：看家；
 */
public class test1 {
    public static void main(String[] args) {
        Cat c = new Cat("加菲", 8);
        System.out.println(c.getName() + "..." + c.getAge());
        c.eat();
        c.catchMouse();

        Dog d = new Dog("旺财", 10);
        System.out.println(d.getName() + "..." + d.getAge());
        d.eat();
        d.lookHome();
    }
}

abstract class Animal {
    private String name;            //姓名
    private int age;                //年龄

    public Animal() {
    }             //空参构造

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}

class Cat extends Animal {
    public Cat() {
    }

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("毛吃鱼");
    }

//    public void eat() {
//        System.out.println("猫吃鱼");
//    }

    public void catchMouse() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }

//    public void eat() {
//        System.out.println("狗吃肉");
//    }

    public void lookHome() {
        System.out.println("看门");
    }
}
