package com.Berlin.简单工厂;

/**
 * @author Berlin
 * @Time 2020/11/10 0:16
 */
public class Test {
    public static void main(String[] args) {
//        Dog d = AnimalFactory.createDog();
        Dog d = (Dog) AnimalFactory.createAnimal("dog");
        d.eat();

        Cat c  = (Cat) AnimalFactory.createAnimal("cat");
        c.eat();

    }
}
