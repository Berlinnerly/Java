package com.berlin.Math;

/**
 * @author Berlin
 * date 2020/10/23 13:32
 */

/*
    Math类包含了用于执行基本数学运算的方法，如初等指数，对数，平方根和三角函数；
    public static int abs(int a);                                                //取绝对值
    public static double ceil(double a);                                        //向上取整，结果是double
    public static double floor(double a);                                       //向下取整，结果是double
    public static int max(int a,int b);                                     //获取两个值中的最大值，最小值用min
    public static double pow(double a,double b);                //前面的数是底数，后面的是指数
    public static double random();                      //生成0.0-1.0之间的随机数，包括0.0，不包括1.0
    public static int round(float a);                   //四舍五入
    public static double sqrt(double a);                //开平方
 */
public class Math_ {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.abs(-10));

        System.out.println(Math.ceil(12.3));        //13.0
        System.out.println(Math.ceil(12.99));       //13.0

        System.out.println(Math.floor(12.3));        //13.0
        System.out.println(Math.floor(12.99));       //13.0

        System.out.println(Math.pow(2, 3));

        System.out.println(Math.random());

        System.out.println(Math.round(12.3f));
        System.out.println(Math.round(12.9f));

        System.out.println(Math.sqrt(4));
        System.out.println(Math.sqrt(2));
    }
}
