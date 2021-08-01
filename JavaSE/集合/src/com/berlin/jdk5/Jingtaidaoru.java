package com.berlin.jdk5;

import static java.util.Arrays.sort;            //静态导入
import static java.util.Arrays.toString;

/**
 * @author Berlin
 * @Time 2020/10/28 14:28
 */

/*
    静态导入：
        可以直接导入类中的静态方法
    格式：
        import static 包名。。。类名.方法名
        可以直接导入到方法的级别
        方法必须是静态的，如果有多个同名的静态方法，容易不知道使用谁，要使用必须加前缀，因此意义不大，一般不用
 */
public class Jingtaidaoru {
    public static void main(String[] args) {
        int[] arr = {55,22,33,44,11};
        sort(arr);                           //排序
//        System.out.println((toString(arr)));
    }
}
