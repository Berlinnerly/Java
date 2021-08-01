package javajichu;
import java.util.Scanner;
public class GameNum2 {
    public static void main(String[] args) {
        System.out.println("我们来玩个猜数字的小游戏吧！范围在0-100之间嗷！");
        System.out.println("我现在已经想好了一个数字，来猜猜看吧！");
        Scanner sc = new Scanner(System.in);
        int getNum = sc.nextInt();

//        int gusee = (int)(Math.random() * 100 + 1);

        while (true) {
            int gusee = (int)(Math.random() * 100 + 1);
            if (getNum > gusee) {
                System.out.println("不好意思，你猜错了嗷，大了！试着猜小一点的数吧！");
                System.out.println(gusee);
            } else if (getNum < gusee) {
                System.out.println("不好意思，你猜错了嗷，小了！试着猜大一点的数吧！");
                System.out.println(gusee);
            } else {
                System.out.println("恭喜你，猜对啦！我心里的数字就是：" + gusee);
                System.out.println(gusee);
                break;
            }
        }
    }
}
