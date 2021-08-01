package com.Berlin.reflect;

/**
 * @author Berlin
 * @Time 2020/11/13 8:41
 */

/*
    类的加载概述：
        当程序要使用某个类时，如果该类还未被加载到内存中，则系统会通过加载，连接，初始化三步来对类进行初始化
        加载：
            将class文件读入内存，并创建一个class对象，任何类被使用时系统都会建立一个class对象
        连接：
            验证：是否有正确的内部结构，并和其他类协调一致
            准备：负责为类的静态成员分配内存，并设置默认初始化值
            解析：将类的二进制数据中的符号引用替换为直接引用
        初始化

    加载时机：
        创建类的实例
        访问类的静态变量，或者为静态变量赋值
        调用类的静态方法
        使用反射方式来强制创建某个类或接口对应的java.lang.class对象
        初始化某个类的子类
        直接使用java.exe来运行某个主类
 */

/*
    类加载器的概述
        负责将.class文件加载到内存中，并为之生成对应的.class对象，
    类加载器的分类：
        Bootstrap ClassLoader   根类加载器
        Extension ClassLoader   扩展类加载器
        System ClassLoader      系统类加载器
    加载器的作用：
        Bootstrap ClassLoader   根类加载器
            也被称之为引导类加载器，负责java核心类的加载
            比如System,String等，在jdk中jre的lib目录下rt.jar文件中
        Extension ClassLoader   扩展类加载器
            负责jre的扩展目录中jar包的加载
        System ClassLoader      系统类加载器
            负责在jvm启动时加载来自Java命令的class文件，以及class path环境变量所指定的jar包和类路径


 */
public class LeiJiaZai_ {
    public static void main(String[] args) {

    }
}
