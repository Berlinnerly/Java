package com.Berlin.test;

/**
 * @author Berlin
 * @Time 2020/11/9 9:22
 */

/*
    斐波那契数列

    假设一对刚出生的兔子一个月后就能长成大兔，再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，一年内没有发生死亡
    问：一对刚出生的兔子，一年内繁殖出多少对兔子？

    1 = fun(1)
    1 = fun(2)
    2 = fun(1) + fun(2)
    3 = fun(2) + fun(3)
 */
public class Test5 {
    public static void main(String[] args) {
//        demo1();
        System.out.println(fun(8));

    }

    public static void demo1() {
        //用数组做
        int[] arr = new int[8];
        //数组中第一个元素和第二个元素都为1
        arr[0] = 1;
        arr[1] = 1;
        //遍历数组对其他元素赋值；
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        //如何获取最后一个数
        System.out.println(arr[arr.length - 1]);
    }
        /*
            用递归求斐波那契数列
         */
    public static int fun(int num) {
        if (num == 1 || num ==2) {
            return 1;
        } else {
            return fun(num-2)+fun(num-1);
        }
    }
}
