//根据键盘录入的数据输出对应的乘法表

import java.util.Scanner;

public class 练习2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个1-9之间的整数：");
        int x = sc.nextInt();
        print(x);
    }

    public static void print(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }
    }
}
