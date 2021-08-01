package javajichu;

import java.util.Scanner;

public class ChangFangXing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个长方形的宽：");
        int a = sc.nextInt();
        System.out.println("请输入一个长方形的高：");
        int b = sc.nextInt();


//        Rectangle x = new Rectangle();
//        x.setHigh(5);
//        x.setWidth(6);
//        int y = x.getLength();
//        System.out.println(y);

        Rectangle x = new Rectangle(a, b);
        int y = x.getLength();
        System.out.println("您输入的长方形的周长是：" + y);
        int z = x.getArea();
        System.out.println("您输入的长方形的面积是：" + z);
    }
}

class Rectangle {
    /*
    定义一个长方形类，定义求周长，面积的方法
    定义一个测试类进行测试

    成员变量：宽width,高high
    成员方法：
        getXxx,setXxx;
        getLength(); getArea();
     */
    private int width;
    private int high;

    public Rectangle() {
    }              //空参构造

    public Rectangle(int width, int high) {      //有参构造
        this.width = width;
        this.high = high;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        this.high = high;
    }

    //周长
    public int getLength() {
        int length = this.width * 2 + this.high * 2;
        return length;
    }

    //面积
    public int getArea() {
        int area = this.width * this.high;
        return area;
    }
}
