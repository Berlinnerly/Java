package javajichu;

/**
 * 这是一个数组工具类，里面封装了获取最大值，打印数组以及数组反转的方法。
 *
 * @author zx
 * version v1.0
 */
public class ArrayTool {
    //如果在一个类中所有方法都是静态，必须要私有构造方法,目的是不让其他类创建对象，直接用类名.调用即可。

    /**
     * 私有构造方法。
     */
    private ArrayTool() {
    }
    //获取最大值

    /**
     * 这是获取数组中最大值的方法
     *
     * @param arr 接受一个int类型的数组；
     * @return 返回数组中的最大值；
     */
    public static int getMax(int[] arr) {
        int max = arr[0];                   //拿出第一个元素；
        for (int i = 1; i <= arr.length - 1; i++) {       //从第二个元素开始遍历
            if (max < arr[i]) {                 //max与其他元素比较
                max = arr[i];                   //记录较大的
            }
        }
        return max;                             //将最大值返回
    }

    //数组的遍历

    /**
     * 这是遍历数组的方法
     *
     * @param arr 接受一个int类型的数组
     */
    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {           //数组的遍历；
            System.out.print(arr[i] + " ");
        }
    }

    //数组的反转

    /**
     * 这是数组反转的方法
     *
     * @param arr 接受一个int类型的数组
     */
    public static void revArray(int[] arr) {
        for (int i = 0; i <= arr.length / 2; i++) {           //循环次数是元素个数的一半
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }
}