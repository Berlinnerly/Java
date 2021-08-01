package com.berlin.array;

/**
 * @author Berlin
 * date 2020/10/22 13:35
 */

/*
    数组高级二分查找代码

    注意事项：
        如果数组无序，就不能使用二分查找
            如果你排序了，但是你排序的时候已经改变了我最原始的元素索引
 */
public class ErFenChaZhao {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44, 55, 66, 77};
        int i = getIndex(arr, 55);
        System.out.println(i);
    }

    /**
     * @param arr
     * @param value
     * @return int
     */
    public static int getIndex(int[] arr, int value) {
        int min = 0;
        int max = arr.length - 1;
        int mid = (min + max) / 2;

        while (arr[mid] != value) {             //当中间值不等于要找的值就开始循环；
            if (arr[mid] < value) {              //当中间值小于要找的值；
                min = mid + 1;                  //最小的索引改变；
            } else if (arr[mid] > value) {           //当中间值大于要找的值；
                max = mid - 1;                  //最大的索引改变；
            }
            mid = (min + max) / 2;              //无论最大还是最小改变，中间索引都会随之改变；

            if (mid > max) {                    //如果最小索引大于最大索引就没有查找的可能性了
                return -1;                      //返回-1；
            }
        }
        return mid;
    }
}
