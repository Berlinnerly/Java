package com.berlin.Calendar_;

import java.util.Calendar;

/**
 * @author Berlin
 * @date 2021/1/7 15:35
 */
public class Test1 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.get(Calendar.YEAR + Calendar.MONTH + Calendar.DAY_OF_MONTH + Calendar.DAY_OF_WEEK));
    }
}
