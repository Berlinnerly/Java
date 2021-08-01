import java.util.Scanner;

public class 方法 {
    /*
    方法的格式：
    修饰符 返回值类型 方法名（参数类型 参数名1，参数类型 参数名2.。。） {
    方法体语句；
    return 返回值；
    }

    修饰符：public static
    返回值类型 :功能结果的数据类型
    方法名：符合命名规则即可
    参数：
        实际参数：实际参与运算的；
        形式参数：方法定义上的，用于接受实际参数；
    参数类型：就是参数的数据类型；
    参数名：就是变量名；
    方法体语句：完成功能的代码；
    return:结束方法的；
    返回值：功能的结果，由return带给调用者；

    方法如果有返回值，必须用return语句带回
     */

    //键盘录入两个值，比较大小
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int x = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int y = sc.nextInt();
//        int haha = getMax(x, y);
//        System.out.println(haha);
        boolean xixi = isEquals(x, y);
        System.out.println(xixi);
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    //键盘录入两个值，判断是否相等
    public static boolean isEquals(int a, int b) {
        return a == b; /*? true : false;*/


        //方法重载：方法名相同，参数列表不同，与返回值类型无关
        /*
        重载的分类：
        1.参数个数不同
        2.参数类型不同
            顺序不同
         */
    }
}



