//内存
        /*
        栈：（存储局部变量）
        局部变量：定义在方法声明上和方法中的变量
        堆：（存储new出来的数组或对象）
        方法区：
        本地方法区：和系统有关；
        寄存器：给cpu使用；

        栈：先进后出；
         */
public class 堆栈 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        System.out.println(arr);

        arr[0] = 10;
        arr[1] = 20;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
    }
}
