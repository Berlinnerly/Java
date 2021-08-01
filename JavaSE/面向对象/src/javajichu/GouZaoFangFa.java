package javajichu;
class GouZaoFangFa {
    public static void main(String[] args) {
        //Person p = new Person();        //在创建对象的时候系统就已经调用了构造方法。
        //p.Person();       构造方法不能用方法调用
        Person p2 = new Person("张三",23);
        p2 = new Person("李四",23);   //这种方法看运行结果貌似是改名了，其实是将原对象变成了垃圾；
//        p2.show();

        Person p3 = new Person();
        p3.setName("wangswu");
        p3.setAge(24);
        p3.setName("xiaohu");           //这才是真正的改名
    }
}
    /*
    构造方法的概述和作用：
        给对象的数据（属性）进行初始化；
    构造方法格式特点：
        1.方法名与类名相同（大小也要一致）
        2.没有返回值类型，连void都没有；
        3.没有具体的返回值return;
     */


    /*
    注意事项：
        1.如果我们没有给出构造方法，系统将自动提供一个无参的构造方法；
        2.如果我们给出了构造方法，系统将不再提供默认的构造方法；
            注意：这个时候，如果还想用无参的构造方法，就必须自己给出，建议自己永远给出无参的构造方法；
     */

        //构造方法的重载，方法名相同，与返回值无关，只看参数列表；
class Person {
    private String name;
    private int age;

    //构造方法
    public Person() {
        System.out.println("这是空参的构造");
        //return;             //构造方法也是有return语句的；
    }
    public Person(String name,int age) {
        System.out.println("这是有参的构造");
        this.name = name;
        this.age = age;
    }

//    public void show() {
//        System.out.println(this.name + this.age);
//    }

    //设置姓名
    public void setName(String name) {
        this.name = name;
    }

    //获取姓名
    public String getName() {
        return name;
    }

    //设置年龄
    public void setAge(int age) {
        this.age = age;
    }

    //获取年龄
    public int getAge() {
        return age;
    }
}


/*
构造方法与setXxx方法的区别：
    构造方法是给属性就行初始化
    setXxx方法是修改属性值；
    这两种方法在开发中用setXxx多一点，因为比较灵活；
 */
