package com.berlin.bean;

/**
 * @author Berlin
 * @Time 2020/10/27 17:44
 */
public class Tool<Q> {
    private Q q;

    public static <W> void print(W w) {         //静态方法是随着类的加载而加载的，必须声明自己的泛型
        System.out.println(w);
    }

    public Q getObj() {
        return q;
    }

    public void setObj(Q q) {
        this.q = q;
    }

    public <T> void show(T t) {             //方法泛型最好是与类的泛型一致
        System.out.println(q);              //如果不一致，需要在方法上生命该泛型
    }
}

