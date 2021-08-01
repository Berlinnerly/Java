package com.berlin.jdbc;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionTest {

    // 方式一：
    @Test
    public void testConnection1() throws SQLException {
        // 获取Driver的实现类对象
        Driver driver = new com.mysql.jdbc.Driver();

        // jdbc:mysql:协议
        // localhost: ip地址
        // 3306: 端口
        // test: 数据库名
        String url = "jdbc:mysql://localhost:3306/test";

        // 将用户名和密码封装在Properties中
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "mysql");

        Connection conn = driver.connect(url, info);
        System.out.println(conn);
    }

    // 方式二：对方式一的迭代:在如下的程序中不出现第三方的API，具有可移植性
    @Test
    public void testConnection2() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        // 1. 获取Driver的实现类对象:使用反射
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        // 2. 提供要连接的数据库
        String url = "jdbc:mysql://localhost:3306/test";

        // 3. 提供连接需要的用户名和密码
        Properties info = new Properties();
        info.setProperty("user", "root");
        info.setProperty("password", "mysql");

        // 4. 获取连接
        Connection conn = driver.connect(url, info);
        System.out.println(conn);
    }

    // 方式三：使用DriverManager替换Driver
    @Test
    public void testConnection3() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        // 1. 获取Driver的实现类对象
        Class clazz = Class.forName("com.mysql.jdbc.Driver");
        Driver driver = (Driver) clazz.newInstance();

        // 2. 另外三个连接的基本信息
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "mysql";

        // 1. 注册驱动
        DriverManager.registerDriver(driver);

        // 2. 获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }

    // 方式四:可以只是加载驱动，不用显示的注册驱动过了
    @Test
    public void testConnection4() throws ClassNotFoundException, IllegalAccessException, InstantiationException, SQLException {
        // 1. 提供三个连接的基本信息
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "mysql";

        // 2. 加载Driver
        Class.forName("com.mysql.jdbc.Driver");

        // 3. 获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }

    // 方式五：将数据库需要连接的四个基本信息声明在配置文件中，通过读取配置文件的方式，获取连接对象
    @Test
    public void testConnection5() throws IOException, ClassNotFoundException, SQLException {
        // 1. 通过类加载器读取配置文件的信息
//        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("jdbc.properties");
        Properties pros = new Properties();
        pros.load(is);

        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        String url = pros.getProperty("url");
        String driverClass = pros.getProperty("driverClass");

        // 2. 加载驱动
        Class.forName(driverClass);

        // 3. 获取连接
        Connection conn = DriverManager.getConnection(url, user, password);
        System.out.println(conn);
    }
}
