package com.Berlin.枚举;

/**
 * @author Berlin
 * @Time 2020/11/13 13:34
 */
public class Week2 {
    public static final Week2 MON = new Week2("星期一");
    public static final Week2 TUE = new Week2("星期二");
    public static final Week2 WED = new Week2("星期三");

    private String name;
    private Week2(String name) {             //私有构造，不让其他类创建本类对象
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
