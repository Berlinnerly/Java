package com.berlin.SimpleDateFormat_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Berlin
 * date 2020/10/23 17:07
 */


public class test {
    /**
     * 需求：算一算你来这个世界多少天了
     * 分析：
     * 1.将生日字符串和今天字符串存在String类型的变量中
     * 2.定义日期格式化对象
     * 3.将日期字符串转换成日期对象
     * 4.通过日期对象获取时间毫秒值；
     * 5.将两个毫秒值相减除以1000再除以60，再除以60，再除以24，得到天
     */
    public static void main(String[] args) throws Exception {
        // 1. 将生日字符串和今天字符串存在String类型的变量中
        String birthday = "1997年10月14日";
        String today = "2021年1月8日";

        // 2. 定义日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");

        // 3. 将日期字符串转换成日期对象
        Date d1 = sdf.parse(birthday);
        Date d2 = sdf.parse(today);

        // 4. 通过日期对象获取时间毫秒值；
        long time = d2.getTime() - d1.getTime();

        // 5. 将两个毫秒值相减除以1000再除以60，再除以60，再除以24，得到天
        System.out.println(time / 1000 / 60 / 60 / 24);
    }
}
