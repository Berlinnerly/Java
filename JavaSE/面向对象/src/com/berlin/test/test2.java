package com.berlin.test;

/**
 * @author Berlin
 * date 2020/10/21 15:47
 */

/*
    统计大串中小串出现的次数
 */
public class test2 {
    public static void main(String[] args) {
        String max = "woaiheima,heimabutongyubaima,wulunheimahaishibaima,zhaodaogongzuojiushihaoma";
        String min = "heima";

        int count = 0;      //计数器
        int index = 0;      //索引

        //定义循环，判断小串是否在大串中出现
        while((index = max.indexOf(min)) != -1) {
            count++;            //计数器自增
            max = max.substring(index + min.length());
        }
        System.out.println(count);
    }
}
