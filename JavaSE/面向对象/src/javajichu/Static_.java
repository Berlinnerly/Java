package javajichu;
public class Static_ {
    public static void main(String[] args) {
        /*
        static关键字的特点：
        1.随着类的加载而加载；
        2.优先于对象存在；
        3.被类的所有对象共享；
        4.可以通过类名调用（其实它本身也可以通过对象调用）
        总结:共性用静态，特性用非静态；


        Static关键字的注意事项：
        1.在静态方法中是没有this关键字的；
            静态是随着类的加载而加载的；this是随着对象的创建而存在；
            静态比对象先存在；
        2.静态方法只能访问静态的成员变量和静态的成员方法；
            静态方法：
                成员变量：只能访问静态变量;
                成员方法：只能访问静态成员方法;
            非静态方法：
                成员变量：可以是静态的，也可以是非静态的；
                成员方法：可以是静态的成员方法，也可以是非静态的成员方法；
        总结：静态只能访问静态。
         */
//        Demo1 d = new Demo1();
//        d.print1();

        Demo1.print2();
    }
}

class Demo1 {
    int num1 = 10;                          //非静态成员变量
    static int num2 = 20;                   //静态成员变量

    public void print1() {              //非静态方法既可以访问静态成员变量也可以访问非静态成员变量
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void print2() {
//        System.out.println(num1);         静态方法不能访问非静态成员变量
        System.out.println(num2);
    }
}

/*
静态变量和成员变量的区别：
静态变量也叫类变量；成员变量也叫对象变量；
1.所属不同：
    静态变量属于类；
    成员变量属于对象；
2.内存中的位置不同；
    静态变量存储与方法区的静态区；
    成员变量存储与堆内存；
3.内存出现时间不同；
    静态变量随着类的加载而加载，随着类的消失而消失；
    成员变量随着对象的加载而加载，随着对象的消失而消失；
4.调用不同；
    静态变量可以通过类名调用，也可以通过对象调用；
    成员变量只能通过对象调用。
 */


/*
主方法格式详解：
public static void main(String[] args) {}
public :被jvm调用，所以权限要足够大；
static：被jvm调用，不需要创建对象，直接类名.调用即可；
void:被jvm调用， 不需要有任何的返回值；
main:只有这样写才能被jvm识别，main不是关键字；
String[] args:以前是用来接收键盘录入的。
 */
