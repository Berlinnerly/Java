//根据用户输入的行数和列数，输出对应行数和列数的*

import java.util.Scanner;

public class 练习1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入行数:");
        int x = sc.nextInt();
        System.out.println("请输入列数：");
        int y = sc.nextInt();
        //没有明确的返回值的方法调用时，单独调用
        print(x, y);
    }

    public static void print(int a, int b) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
