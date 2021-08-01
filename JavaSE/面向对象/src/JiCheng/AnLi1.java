package JiCheng;

/*
    使用继承前学生和老师的案例
    属性：姓名，年龄；
    行为：吃饭；
    老师特有的方法：讲课；
    学生特有的方法：学习
 */
public class AnLi1 {
    public static void main(String[] args) {

    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
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

    public void eat() {
        System.out.println("学生吃饭");
    }

    public void study() {
        System.out.println("学生学习");
    }
}

class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
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

    public void eat() {
        System.out.println("老师吃饭");
    }

    public void teach() {
        System.out.println("老师讲课");
    }
}
