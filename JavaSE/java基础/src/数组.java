public class 数组 {
    /*
    数组（容器）：存储同种数据类型的多个元素的集合；（可以存储基本数据类型也可以存储引用数据类型）；
    数组的定义格式：
        数据类型[] 数组名 = new 数据类型[数组的长度]；
     */
    public static void main(String[] args) {
        //int[] arr = new int[5];         //可以存储5个int类型的数据；
        /*
        左边的int:数据类型；
        []:代表的是数组，几个中括号就代表几维数组；
        arr:合法的标识符；
        new:创建新的实体或对象；
        右边的int:数据类型；
        []：代表的数组；
        5：代表数组的长度；
         */
//        System.out.println(arr[0]);     //系统给出默认初始化值，整数类型默认都是0；
//
//        arr[0] = 10;
//        System.out.println(arr[0]);
//
//        System.out.println(arr);                //[I@10f87f48

        //[：一个[代表的是一维数组；
        //i: 代表的是int类型；
        //@: 是固定的；
        //10f87f48: 数组的地址值；

        /*
        数组的初始化：为数组开辟连续的内存空间，并为每个元素赋值；

        整数类型：byte,short,int,long默认初始化值都是0；
        浮点类型：float,double默认初始化值都是0.0；
        布尔类型：boolean默认初始化值为false;
        字符类型：char类型默认初始化值为'\u0000';
        char在内存中占的是2个字节（16个二进制位）
        \u0000,每一个0代表十六进制的0，四个0就是十六个二进制位

        如何初始化：
            1.动态初始化：只指定长度，由系统给出初始化值
                int[] arr = new int[5];
            2.静态初始化：给出初始化值，由系统决定长度；
         */


        /*
        数组的静态初始化：
        格式：数据类型[] 数组名 = new 数据类型[]{元素1，元素2.。。}；
        简化格式：数据类型[] 数组名 = {元素1，元素2，。。。}；
         */

//        int[] arr = new int[]{11,22,33};
//        int[] arr2 = {11,2,33};             //简写形式声明和赋值必须在同一行；

        //int[] arr3 = new int[3]{11,22,33};    //不允许动静结合


//        int[] arr = new int[5];
//        System.out.println(arr[5]);     //当访问数组中不存在的索引，会出现索引越界异常；(ArrayIndexOutOfBoundsException)


//        arr = null;
//        System.out.println(arr[0]);         //当数组引用值赋为null,再去调用数组中的元素就会出现空指针异常（NullPointerException）


        //数组的遍历
        int[] arr = {1, 2, 3, 9, 5};
//        for (int i = 0; i < 5;i++) {
//            System.out.println(arr[i]);
//        }

        //arr.length可以查看数组的长度；
//        System.out.println(arr.length);
//        for (int i = 0;i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
//
//        int[] arr2 = {4,5,6};
//        print(arr2);
//    }

    /*
    使用方法对数组进行遍历
    返回值类型：void
    参数列表：int[] arr
     */

//    public static void print(int[] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }


        int max = getMax(arr);
        System.out.println(max);


        int index = getIndex(arr, 2);
        System.out.println(index);
    }


    //使用方法获取数组中的最大值
    //返回值类型：int
    //参数列表: int[] arr
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }


    //数组的反转
    //返回值类型：void
    //参数列表：int[] arr
    public static void reverseArray(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            //arr[0]和arr[arr.length-1-0]交换
            //arr[1]和arr[arr.length-1-1]交换
            //arr[2]和arr[arr.length-1-2]交换

            //定义第三方变量，交换
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    //数组查表法
    //根据键盘录入索引，查找对应星期；

    //返回值类型：char
    //参数列表：int week
    public static char getWeek(int week) {
//        char[] weekArr = {' ', '一', '二', '三', '四', '五', '六', '日'};
        char[] weekArr = {' ', '一'};
        return weekArr[week];
    }


    //数组元素查找（查找指定元素第一次在数组中出现的索引）
    //返回值类型：int
    //参数列表：int[] arr,int[] value
    public static int getIndex(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {           //数组的遍历
            if (arr[i] == value) {                      //如果数组中的元素与查找的元素匹配；
                return i;
            }
        }
        return -1;
    }
}
