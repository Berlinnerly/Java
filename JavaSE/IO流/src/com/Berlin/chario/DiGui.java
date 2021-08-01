package com.Berlin.chario;

/**
 * @author Berlin
 * @Time 2020/11/6 13:29
 */

/*
    递归：
        方法自己调用自己
    5！
        5 * 4 * 3 * 2 * 1

    递归的弊端：不能调用次数过多，容易导致栈内存溢出
    好处：不用知道循环次数

    构造方法是否可以递归调用            不能使用递归调用
    递归调用是否必须有返回值            不一定，可以有也可以没有
 */

public class DiGui {
    public static void main(String[] args) {
        int result = 1;
/*
        for (int i = 1; i <= 5; i++) {
            result = result * i;
        }
*/

        System.out.println(result);
        System.out.println(fun(10000));
    }

    public static int fun(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * fun(num - 1);
        }
    }
}

class Person {
    public Person() {
    }
}
                                                            