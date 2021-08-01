package com.berlin.array;

import java.util.Arrays;

/**
 * @author Berlin
 * date 2020/10/22 13:57
 */

/*
    public static String toString(int[] arr);
    public static void sort(int[] arr);
    public static int binarySearch(int[] arr,int key);
 */

public class Arrays_ {
    public static void main(String[] args) {
        int[] arr = {22, 33, 11, 44, 66, 55};
        // 数组转字符串
        System.out.println(Arrays.toString(arr));

        //排序
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //需要给排序好的数组
        int[] arr2 = {11, 22, 33, 44, 55, 66, 77, 88};

        //二分查找
        int i = Arrays.binarySearch(arr2, 33);
        System.out.println(i);
    }
}
