package com.berlin.array;

/**
 * @author Berlin
 * date 2020/10/22 9:11
 */

/*
    冒泡排序
        需求：{24，69，80，57，13}
            对数组元素进行排序

        原理：相邻元素两两比较，第一次完毕，最大值出现在了最大索引处；
 */
public class MaoPaoPaiXu {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        //bubbleSort(arr);
        selectSort(arr);
        print(arr);
    }

    /**
     * 冒泡排序
     * @param arr
     */
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {            //外循环只需要比较arr.length-1次就可以了
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                   /* int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;*/
                    swap(arr, j, j + 1);
                }
            }
        }
    }


    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    /**选择排序：
    从0索引开始，依次和后面的元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处。

    1.返回值类型；void
    2.参数列表：int[] arr
     */
    public static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {            //只需要比较arr.length - 1次
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                /*    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;*/
                    swap(arr, i, j);
                }
            }
        }
    }

    /**
    换位操作：
        1.返回值类型：void；
        2.参数列表：int[] arr,int i,int j;

        如果某个方法只针对本类使用，不想让其他类使用，就可以定义成私有的；
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}