package com.Berlin.枚举;

/**
 * @author Berlin
 * @Time 2020/11/13 13:30
 */
public class Week {
    public static final Week MON = new Week();
    public static final Week TUE = new Week();
    public static final Week WED = new Week();
    private Week() {}               //私有构造，不让其他类创建本类对象
}
