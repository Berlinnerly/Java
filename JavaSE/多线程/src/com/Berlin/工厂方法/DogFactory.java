package com.Berlin.工厂方法;

/**
 * @author Berlin
 * @Time 2020/11/10 0:29
 */
public class DogFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
