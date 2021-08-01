package javajichu;
import java.util.Scanner;
public class GameNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数，范围在0-100之间：");
        int guess = (int)(Math.random() * 100) + 1;

        while (true) {
            int result = sc.nextInt();
            if (result > guess) {
                System.out.println("不好意思，大了！");
            } else if (result < guess) {
                System.out.println("不好意思，小了！");
            } else {
                System.out.println("恭喜你，猜对了！");
                break;
            }
        }
    }
}
