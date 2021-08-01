package com.berlin.homework;

/**
 * @Author: Berlinnerly
 * @Package: com.berlin.homework
 * @FileName: ASCII_.java
 * @Tools: IntelliJ IDEA
 * @Time: 2021/4/13 11:46
 * @Blog: baigeinanhai.com
 * @Version: 1.0
 * @Description:
 */
public class ASCII_ {
    public static void main(String[] args) {
        for (int i = 0; i <= 127; i++) {
            System.out.printf("%o, %d, %x, %c", i, i, i, i);
            System.out.println();
        }

        int x = 3, y = 4;
        swap_(x, y);
        System.out.println(x);
        System.out.println(y);

//        passwd();
    }

    public static void swap_(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);
    }


//    public static void passwd() {
//        System.out.println("请输入你要加密的");
//        Scanner scanner = new Scanner(System.in);
//        String s = scanner.nextLine();
//        ArrayList<Byte> bytes = new ArrayList<>(Integer.parseInt(s));
//    }
}
