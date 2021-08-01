package com.berlin.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Berlin
 * @Time 2020/11/2 13:21
 */

/*
    Map:
        将键映射到值的对象
        一个映射不能包含重复的键
        每个键最多只能映射到一个值
    Map和Collection接口的不同
        Map是双列的，Collection是单列的
        Map的键唯一，Collection的子体系Set是唯一的
        Map集合的数据结构值针对键有效，跟值无关，Collection集合的数据体系是针对元素有效

    Map集合的功能：
        1.添加功能：
            put(k key, v value):添加元素
            如果键是第一次存储，就直接存储元素，返回null
            如果键不是第一次存在，就用值把以前的值替换掉，返回以前的值
        2.删除功能：
            void clear():移除所有的键值对元素
            v remove(Object key):根据键删除键值对元素，并把值返回
        3.判断功能：
            boolean containsKey(Object key):判断集合是否包含指定的键
            boolean containsValue(Object value):判断集合是否包含指定的值
            boolean isEmpty():判断集合是否为空
        4.获取功能:
            Set<Map.Entry<k,v>> entrySet();
            V get(Object key):根据键获取值
            Set<k> KeySet():获取集合中所有键的集合
            Collection<v> values():获取集合中所有值的集合
        5.长度功能：
            int size():返回集合中键值对的个数


 */
public class Map_ {
    public static void main(String[] args) {
//        demo1();
//        demo2();
        Map<String, Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);

        Collection<Integer> c = map.values();
        System.out.println(c);
        System.out.println(map.size());
    }

    public static void demo2() {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三",23);
        map.put("李四",24);
        map.put("王五",25);
        map.put("赵六",26);

//        Integer value = map.remove("张三");           //根据键删除元素，返回键对应的值
//        System.out.println(value);
        System.out.println(map.containsKey("张三"));      //判断是否包含这个键
        System.out.println(map.containsValue(23));          //判断是否包含这个值
        System.out.println(map);
    }

    public static void demo1() {
        Map<String, Integer> map = new HashMap<>();
        Integer i1 = map.put("张三",23);
        Integer i2 = map.put("李四",24);
        Integer i3 = map.put("王五",25);
        Integer i4 = map.put("赵六",26);
        Integer i5 = map.put("张三",26);          //把被覆盖的值返回，相同的键不存储，值覆盖

        System.out.println(map);

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);
    }
}
