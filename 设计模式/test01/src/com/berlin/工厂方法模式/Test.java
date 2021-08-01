package com.berlin.工厂方法模式;

import com.berlin.工厂设计模式.Animal;
import com.berlin.工厂设计模式.Cat;
import com.berlin.工厂设计模式.Dog;

/**
 * @author Berlin
 * @date 2021/1/21 22:00
 * @description
 */
public class Test {
    public static void main(String[] args) {
        CatFactory catFactory = new CatFactory();
        Cat cat = (Cat) catFactory.createAnimal();
        cat.eat();

        DogFactory dogFactory = new DogFactory();
        Dog dog = (Dog) dogFactory.createAnimal();
        dog.eat();
    }
}
