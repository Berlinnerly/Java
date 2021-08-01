package JiCheng;
//使用继承后的学生老师案例
public class AnLi2 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.setName("张三");
        s1.setAge(23);
        System.out.println(s1.getName()  + "..." + s1.getAge());
        s1.eat();
        s1.study();
        System.out.println("----------------------------------------------");

        Student1 s2 = new Student1("李四",24);
        System.out.println(s2.getName() + "..." + s2.getAge());
        s2.eat();
        s2.study();
    }
}

class Person {
    private String name;
    private int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void eat() {
        System.out.println("吃饭");
    }
}

class Student1 extends Person {
    public Student1() {}

    public Student1(String name, int age) {
        super(name,age);
    }

    public void study() {
        System.out.println("学生学习");
    }
}

class Teacher1 extends Person {
    public Teacher1() {}

    public Teacher1(String name, int age) {
        super(name,age);
    }

    public void teach() {
        System.out.println("老师讲课");
    }
}