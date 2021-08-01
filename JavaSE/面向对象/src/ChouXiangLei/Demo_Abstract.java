package ChouXiangLei;

public class Demo_Abstract {
    public static void main(String[] args) {
        //Animal1 a = new Animal1();              //抽象类不能被实例化
        Animal2 animal2 = new Animal2();
        animal2.eat();
    }
}

abstract class Animal1 {                        //抽象类
    public abstract void eat();                 //抽象方法
}

class Animal2 extends Animal1 {
    @Override
    public void eat() {
        System.out.println("eat");
    }
}