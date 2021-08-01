package JieKou;

public class Deome1_interface {
    public static void main(String[] args) {
//        Inter i = new Inter();            //接口不能被实例化
        Inter i = new Demo();               //父类引用指向子类对象
        i.print();
    }
}

//interface Inter {
//    public abstract void print();           //接口中的方法都是抽象的
//
//}
//
//class Demo implements Inter {
//    public void print() {
//        System.out.println("print");
//    }
//}