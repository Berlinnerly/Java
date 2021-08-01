package Bao;

/*
    package关键字
        将字节码（.class）进行分类存放；

    定义包的格式：
        package 包名；
        多级包用.分开即可；

        注意事项：
            1.package语句必须是程序的第一条可执行代码；
            2.package语句在一个Java文件中只能有一个；
            3.如果没有package，默认表示无包名；

    如何编译运行带包的类
        编译：
            javac -d . HelloWorld.java
        运行：
            java 包名.HelloWorld

    不同包下类之间的访问

    import关键字的使用
        就是让有包的类对调用者可见，不用写全类名了

        导包格式
        import 包名；
            注意：这种方式导入是到类的名称；
            虽然可以最后写*，但不建议。

    四种权限修饰符
        private 只能在本类中使用；
        默认修饰符   可以在本类中访问，也可以在同一个包下（子类和无关类）中使用；
        protected   本类、同一个包下（子类和无关类）、不同包下（子类）中使用            不同包下（无关类）不能访问
        public 在本类、同一个包下，不同包下（子类），不同包下（无关类）中使用；
    
    类及其组成所常用的常见修饰符
        1.修饰符：
            权限修饰符：private，默认的，protected，public
            状态修饰符：static，final
            抽象修饰符：abstract
        2.类：
            权限修饰符：默认修饰符，public
            状态修饰符：final                                         final修饰类不能有子类
            抽象修饰符：abstract                                      abstract修饰类可以被继承但不能实例化，
            用的最多的就是public
        3.成员变量：
            权限修饰符：private，默认的，protected，public
            状态修饰符：static，final
            用的最多的是private
        4.构造方法：
            权限修饰符：private，默认的，protected，public
            用的最多的就是public
        5.成员方法：
            权限修饰符：private，默认的，protected，public
            状态修饰符：static，final
            抽象修饰符：abstract
        6.除此之外的组合规则：
            成员变量：public static final
            成员方法：
                public static
                public abstract
                public final
 */
public class Bao {
    public static void main(String[] args) {

    }
}
