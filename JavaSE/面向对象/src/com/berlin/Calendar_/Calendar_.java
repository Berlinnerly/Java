package com.berlin.Calendar_;

import java.util.Calendar;

/*
    Calendar类是一个抽象类     用来操作日历
    成员方法：
        public static Calendar getInstance();
        public int get(int field);

        public void add(int field,int amount);      //对指定的字段进行向前减或向后加
        public final void set(int year,int month,int date); //修改指定字段
 */
public class Calendar_ {
    public static void main(String[] args) {
//        demo1();
        Calendar c = Calendar.getInstance();    //父类引用指向子类对象
//        c.add(Calendar.YEAR, -1);   //对指定的字段进行向前加或向后减
//        c.set(Calendar.YEAR, 2089);     //修改指定字段
        c.set(2000, 7, 8);
        System.out.println(c.get(Calendar.YEAR) + "年"
                + getNum((c.get(Calendar.MONTH) + 1))
                + "月" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "日"
                + getWeek(c.get(Calendar.DAY_OF_WEEK)));
    }

    public static void demo1() {
        Calendar c = Calendar.getInstance();    //父类引用指向子类对象
        System.out.println(c.get(Calendar.YEAR));       //通过字段获取年
        System.out.println(c.get(Calendar.MONTH));      //通过字段获取月，但是月是从零开始编号的
        System.out.println(c.get(Calendar.DAY_OF_MONTH));//月中的第几天
        System.out.println(c.get(Calendar.DAY_OF_WEEK));//周日是第一天，周六是最后一天

        System.out.println(c.get(Calendar.YEAR) + "年"
                + getNum((c.get(Calendar.MONTH) + 1))
                + "月" + getNum(c.get(Calendar.DAY_OF_MONTH)) + "日"
                + getWeek(c.get(Calendar.DAY_OF_WEEK)));
    }

    /**
     * 将星期存储表中，进行查找
     *
     * @param week
     * @return String
     */
    public static String getWeek(int week) {
        String[] arr = {"", "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六",};
        return arr[week];
    }

    /**
     * 如果是个位数字，前面补零
     *
     * @param num
     * @return
     */
    public static String getNum(int num) {
//        if (num > 9) {
//            return "" + num;
//        } else {
//            return "0" + num;
//        }
        return num > 9 ? "" + num : "0" + num;
    }
}
