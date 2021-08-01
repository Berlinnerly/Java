package com.berlin.工厂设计模式;

/**
 * @author Berlin
 * @date 2021/1/21 21:43
 * @description
 */
public class AnimalFactory {
//    public static Cat createCat() {
//        return new Cat();
//    }
//
//    public static Dog createDog() {
//        return new Dog();
//    }

    public static Animal createAnimal(String name) {
        if ("dog".equals(name)) {
            return new Dog();
        } else if ("cat".equals(name)) {
            return new Cat();
        } else {
            return null;
        }
    }
}
