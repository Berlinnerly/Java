package Date_;

/**
 * @author Berlin
 * @date 2020/10/23 15:45
 */

import java.util.Date;

/*
    Date类表示特定的瞬间，精确到毫秒

    构造：
        public Date();
        public Date(long date);

    方法：
        public long getTime();
        public void setTime(long time);

 */
public class Date_ {
    public static void main(String[] args) {
//        demo();
//        demo2();
        Date d3 = new Date();
        d3.setTime(1000);               //cccccc设置毫秒值，改变时间对象
        System.out.println(d3);
    }

    public static void demo2() {
        Date d = new Date();
        System.out.println(d.getTime());                //通过时间对象获取毫秒值
        System.out.println(System.currentTimeMillis()); //通过系统类的方法获取当前时间毫秒值
    }

    public static void demo() {
        Date d = new Date();
        System.out.println(d);

        Date d2 = new Date(0);
        System.out.println(d2);
    }
}


