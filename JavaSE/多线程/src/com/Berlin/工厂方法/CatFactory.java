package com.Berlin.工厂方法;

/**
 * @author Berlin
 * @Time 2020/11/10 0:28
 */
public class CatFactory implements Factory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
