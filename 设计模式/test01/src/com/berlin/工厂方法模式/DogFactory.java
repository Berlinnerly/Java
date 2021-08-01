package com.berlin.工厂方法模式;

import com.berlin.工厂设计模式.Animal;
import com.berlin.工厂设计模式.Dog;

/**
 * @author Berlin
 * @date 2021/1/21 21:59
 * @description
 */
public class DogFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }
}
