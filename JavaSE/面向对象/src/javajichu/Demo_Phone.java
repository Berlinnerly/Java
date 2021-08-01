package javajichu;
public class Demo_Phone {
    public static void main(String[] args) {
        Phone2 p1 = new Phone2();
        p1.setBrand("华为");
        p1.setPrice(5000);
        p1.show();

        Phone2 p2 = new Phone2("小米",6000);
        p2.show();
    }
}


class Phone2 {
    /*
    手机类的成员变量：品牌（brand）,价格（price）
    构造方法：
        无参
        有参
    成员方法：getXxx   setXxx
            show
     */
    private String brand;
    private int price;

    public Phone2() {}

    public Phone2(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void show() {
        System.out.println(brand + "手机的价格是：" + price);
    }
}