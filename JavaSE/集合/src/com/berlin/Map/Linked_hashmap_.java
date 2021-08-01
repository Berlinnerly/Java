package com.berlin.Map;

import java.util.LinkedHashMap;

/**
 * @author Berlin
 * @Time 2020/11/2 17:18
 */

/*
    LinkedHashMap可以保证怎么存就怎么取
 */
public class Linked_hashmap_ {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("张三",23);
        lhm.put("李四",24);
        lhm.put("王五",25);
        lhm.put("赵六",26);

        System.out.println(lhm);
    }
}
