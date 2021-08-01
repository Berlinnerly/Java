package com.Berlin.工厂方法;

/**
 * @author Berlin
 * @Time 2020/11/10 0:30
 */
public class Test {
    DogFactory df = new DogFactory();
    Dog d = (Dog) df.createAnimal();
//    d.eat();

}
