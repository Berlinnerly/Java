package com.berlin.System;

/**
 * @author Berlin
 * date 2020/10/23 14:17
 */

/*
    System类包含了一些有用的类字段和方法，他不能被实例化；

    public static void gc();                //调用垃圾回收器
    public static void exit(int status);    //终止正在运行的Java虚拟机,非0状态是异常终止
    public static long currentTimeMillis();     获取当前时间的毫秒值
    public static void arraycopy(Object src,int srcPos, Object dest,int destPos,)   将数组内容拷贝
 */
public class System_ {
    public static void main(String[] args) {
//        System.exit(0);
//        System.out.println(111111111);

//        demo();


//        int i = 0;
//        while (i <= 100) {
//            new Demo();
//            System.gc();                    //运行垃圾回收器
//            i++;
//        }
//    }
    }

    public static void demo() {
        long start = System.currentTimeMillis();        //1秒等于1000毫秒
        for (int i = 0;i <= 1000;i++) {
            System.out.println('*');
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}

//class Demo {                //在一个源文件中不允许定义两个用public修饰的类
//    @Override
//    protected void finalize() {
//        System.out.println("垃圾被清理了");
//    }
//}
