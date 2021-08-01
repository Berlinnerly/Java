package com.Berlin.Ã¶¾Ù;

/**
 * @author Berlin
 * @Time 2020/11/13 13:32
 */
public class Enum_ {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        Week3 mon = Week3.MON;
        mon.show();
    }

    public static void demo2() {
        Week2 mon = Week2.MON;
        System.out.println(mon.getName());
    }

    public static void demo1() {
        Week mon = Week.MON;
        Week tue = Week.TUE;
        Week wed = Week.WED;

        System.out.println(mon);
    }
}
