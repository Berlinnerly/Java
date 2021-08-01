package com.Berlin.thread;

/**
 * @author Berlin
 * @Time 2020/11/9 10:40
 */

/*
    两种方式的区别：
        继承thread：
            好处：可以直接使用thread中的方法，代码简单
            弊端：如果已经有了父类，就不能用这种方法
        实现Runnable接口：
            好处：即使自己定义的线程有了父类也没有关系，因为有了父类也可以实现接口，而且接口是可以多实现的
            弊端：不能直接使用thread中的方法需要先获取线程对象，才能得到thread的方法，代码复杂

 */
public class Thread3_ {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();           //创建Runnable的子类对象
        //Runnable target = mr;
        Thread t = new Thread(mr);                  //将其当作参数传递给thread的构造函数
        t.start();                                  //开启线程

        for (int i = 0; i < 1000; i++) {
            System.out.println("bbbb");
        }
    }
}

class MyRunnable implements Runnable {          //1.定义一个类，实现Runnable
    @Override
    public void run() {                         //2.重写run方法
        for (int i = 0; i < 1000; i++) {        //3.将要执行的代码写道run方法中
            System.out.println("aaaaaaaaaaaa");
        }
    }
}
