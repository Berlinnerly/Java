package com.Berlin.exception;

/**
 * @author Berlin
 * @Time 2020/11/3 14:34
 */

/*
    try...catch的方式处理多个异常
    jdk7以后处理多个异常的方式及注意事项：


    try后面如果跟多个catch，小的异常放前面，大的异常放后面，根据多态的原理，如果大的放前面，就会将所有的子类对象接受，后面的catch就没有意义了
 */
public class Exception3_ {
    public static void main(String[] args) {
//        demo1();
        int a = 10;
        int b = 0;
        int[] arr = {11,22,33,44,55};

        //JDK7如何处理多个异常
        try {
            System.out.println(a / b);
            System.out.println(arr[10]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("出错了");
        } /*catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        }*/
    }

    private static void demo1() {
        int a = 10;
        int b = 0;
        int[] arr = {11,22,33,44,55};

        try {
            System.out.println(a / b);
            System.out.println(arr[10]);
            arr = null;
            System.out.println(arr[0]);
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("索引越界了");
        } catch (Exception e) {
            System.out.println("出错了");
        }
    }
}
