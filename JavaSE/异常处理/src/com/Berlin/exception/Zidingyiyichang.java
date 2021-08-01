package com.Berlin.exception;

/**
 * @author Berlin
 * @Time 2020/11/3 16:17
 */

/*
        为什么要自定义异常？
            通过名字区分到底是什么异常，有针对的解决办法

        继承自Exception
        继承自RuntimeException


        异常的注意事项：
            1.子类重写父类方法时，子类的方法必须抛出相同的异常或父类异常的子类；
            2.如果父类抛出多个异常，子类重写父类时，只能抛出相同的异常或者是他的子集，子类不能抛出父类没有的异常；
            3.如果被重写的方法没有抛出异常，那么子类的方法绝对不可以抛出异常，如果子类方法内有异常发生，那么子类只能try，不能throws

        如何使用异常处理：
            原则：如果该功能内部可以将问题处理，用try，如果处理不了，交由调用者处理，这时用throws；
            区别：
                后续程序需要继续运行就try；
                后续程序不需要继续运行就throws；

            如果JDK没有提供对应的异常，需要自定义异常；
 */
public class Zidingyiyichang {
    public static void main(String[] args) {

    }
}

class AgeOfBoundsException extends Exception {
    public AgeOfBoundsException() {
        super();
    }

    public AgeOfBoundsException(String message) {
        super(message);
    }
}
