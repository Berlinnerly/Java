package com.berlin.Calendar_;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 需求:键盘录入一个年份，判断是平年还是闰年
 * <p>
 * 分析：
 * 1.键盘录入年份
 * 2.创建Calendar c = Calendar.getInstance();
 * 3.通过set方法设置为那一年的3月1日
 * 4.将日向前减去1
 * 5.判断日是多少天，如果是29天返回true，否则返回false
 * 1.返回值类型：Boolean
 * 2.参数列表：String
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个年份，判断该年份是闰年还是平年：");
//        int year = sc.nextInt();

        String line = sc.nextLine();        //录入数字字符串
        int year = Integer.parseInt(line);  //将数字字符串转换成数字
        boolean b = getYear(year);
        System.out.println(b);
    }

    private static boolean getYear(int year) {
        //2.创建Calendar c = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        //3.通过set方法设置为那一年的3月1日
        c.set(year, 2, 1);
        //4.将日向前减去1
        c.add(Calendar.DAY_OF_MONTH, -1);
        //5.判断日是多少天，如果是29天返回true，否则返回false
        return c.get(Calendar.DAY_OF_MONTH) == 29;
    }
}
