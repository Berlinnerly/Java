public class 二维数组 {
    public static void main(String[] args) {
        /*
        二维数组的格式：
        int[][] arr = new int[3][2];
         */

//        int[][] arr = new int[3][2];
        //这个二维数组中有三个一维数组，每个一维数组中有两个元素；

        //也可以这样去定义：
//        int[] arr1 [] = new int[3][2];
//        int arr2 [][] = new int[3][2];

//        System.out.println(arr);        //[[I@10f87f48   二位数组
//        System.out.println(arr[0]);     //二维数组中的第一个一维数组
//        System.out.println(arr[0][0]);  //二维数组中的第一个一维数组中的第一个元素

        //二维数组的格式二

//        int[][] arr = new int[3][];

//        int[][] arr3 = new int[3][];    //这是一个二维数组，二维数组中有三个一维数组，三个一维数组都没有被赋值
//        arr3[0] = new int[3];           //第一个一维数组中可以存储三个int值
//        arr3[1] = new int[5];           //第二个一维数组中可以存储五个int值


        //二维数组的格式三
        /*
        int[][] arr = {{1,2,3},{4,5},{6,7,8,9}}
         */
//        int[][] arr4 = {{1,2,3},{4,5},{6,7,8,9}};   //这是一个二维数组，这个二维数组中的每个大括号都代表一个一维数组


        //二维数组的遍历

//        int[][] arr = {{1,2,3},{4,5},{6,7,8,9}};
//        for (int i = 0; i < arr.length; i++) {           //获取二维数组中的每个一维数组
//            for (int j = 0; j < arr[i].length; j++) {        //获取每个以为数组中的元素
//               System.out.print(arr[i][j] + " ");
//           }
//            System.out.println();
//       }

        //二维数组的求和
        int[][] arr = {{22, 66, 44}, {77, 33, 88}, {25, 45, 65}};
        int sum = 0;                                        //定义变量，记录每次相加的结果
        for (int[] ints : arr) {                //获取每一个一维数组
            for (int anInt : ints) {        //获取每一个以为数组中的元素
                sum = sum + anInt;                      //累加
            }
        }
        System.out.println(sum);

        //基本数据类型的值传递，不改变原值，因为调用后就会弹栈，局部变量随之消失
        //引用数据类型的值传递，改变原值，因为即使方法弹栈，但是堆内存数组对象还在，可以通过地址继续访问。
    }

}
