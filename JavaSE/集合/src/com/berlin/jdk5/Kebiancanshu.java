package com.berlin.jdk5;

/**
 * @author Berlin
 * @Time 2020/10/28 15:09
 */

/*
    可变参数：
        定义方法的时候不知道定义多少个参数
    格式：
        修饰符 返回值类型 方法名（数据类型... 变量名） {}
    注意事项：
        这里的变量其实是一个数组
        如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 */
public class Kebiancanshu {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55};
//        print(arr);
        print(11,22,33,44,55);
        System.out.println("--------------------");
//        print();
    }

//    public static void print(int[] arr) {
////        for (int i = 0; i < arr.length; i++) {
////            System.out.println(arr[i]);
////        }
//        //增强for循环
//        for (int i : arr) {
//            System.out.println(i);
//        }
//    }

    public static void print(int x, int... arr) {      //可变参数其实就是一个数组
        for (int i : arr) {
            System.out.println(i);
        }

    }
}
