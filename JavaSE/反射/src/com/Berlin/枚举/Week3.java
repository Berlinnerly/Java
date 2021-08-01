package com.Berlin.枚举;

/**
 * @author Berlin
 * @Time 2020/11/13 13:34
 */
abstract public class Week3 {
    public static final Week3 MON = new Week3("星期一") {
        public void show() {
            System.out.println("星期一");
        }
    };

    public static final Week3 TUE = new Week3("星期二") {
        public void show() {
            System.out.println("星期二");
        }
    };

    public static final Week3 WeD = new Week3("星期三") {
        public void show() {
            System.out.println("星期三");
        }
    };

    private String name;
    private Week3(String name) {             //私有构造，不让其他类创建本类对象
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void show();
}
