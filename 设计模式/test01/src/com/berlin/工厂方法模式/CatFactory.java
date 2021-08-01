package com.berlin.工厂方法模式;

import com.berlin.工厂设计模式.Animal;
import com.berlin.工厂设计模式.Cat;

/**
 * @author Berlin
 * @date 2021/1/21 21:58
 * @description
 */
public class CatFactory implements Factory{
    @Override
    public Animal createAnimal() {
        return new Cat();
    }
}
