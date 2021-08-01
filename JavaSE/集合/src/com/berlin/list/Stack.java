package com.berlin.list;

import java.util.LinkedList;

/**
 * @author Berlin
 * @Time 2020/10/27 16:38
 */
public class Stack {
    private final LinkedList list = new LinkedList();

    /*
    模拟进栈方法
     */
    public void in(Object obj) {
        list.addLast(obj);
    }

    /*
    模拟出栈方法
     */
    public Object out() {
        return list.removeLast();
    }

    /*
    模拟栈结构是否为空
     */
    public boolean isEmply() {
        return list.isEmpty();
    }
}
