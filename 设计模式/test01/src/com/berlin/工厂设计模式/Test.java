package com.berlin.工厂设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 21:44
 * @description
 */
public class Test {
    public static void main(String[] args) {
//        Cat cat = AnimalFactory.createCat();
//        cat.eat();
//
//        Dog dog = AnimalFactory.createDog();
//        dog.eat();

        Animal dog = AnimalFactory.createAnimal("dog");
        dog.eat();

        Animal cat = AnimalFactory.createAnimal("cat");
        cat.eat();
    }
}
