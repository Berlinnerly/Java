package com.berlin.SimpleDateFormat_;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Berlin
 * date 2020/10/23 16:26
 */

/*
    SimpleDateFormat
    构造：
        public SimpleDateFormat();
        public SimpleDateFormat(String pattern);
    成员方法：
        public final String format(Date date);
        public Date parse(String sourse);
 */
public class SimpleDateFormat_ {
    public static void main(String[] args) throws Exception {
//        demo();
//        demo2();
        //将时间字符串对象转换成日期对象
        String str = "2008年08月08日 08:08:08";
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date d = df.parse(str);         //将时间字符串对象转换成日期对象
        System.out.println(d);
    }

    public static void demo2() {
        Date d = new Date();                            //创建当前事件对象
        SimpleDateFormat df = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");   //创建日期格式化对象
        System.out.println(df.format(d));               //将日期对象转换为字符串
    }

    public static void demo() {
        Date d = new Date();                            //创建当前事件对象
        SimpleDateFormat df = new SimpleDateFormat();   //创建日期格式化对象
        System.out.println(df.format(d));
    }
}
