package com.berlin.exercise;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

/**
 * @author Berlin
 * @date 2021/1/23 18:51
 * @description
 */
public class test {
    @Test
    public void testTest() throws IOException, ClassNotFoundException, SQLException {
        InputStream resourceAsStream = test.class.getClassLoader().getResourceAsStream("jdbc.properties");

        Properties properties = new Properties();
        properties.load(resourceAsStream);

        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String classDriver = properties.getProperty("driverClass");
        String url = properties.getProperty("url");

        // 加载驱动
        Class.forName(classDriver);

        // 获得连接对象
        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println(connection);

        String sql = "insert into user(user_name, password, age, sex) value(?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        // 填充占位符
        preparedStatement.setString(1, "berlin");
        preparedStatement.setString(2, "456789");
        preparedStatement.setInt(3, 23);
        preparedStatement.setString(4, "男");

        // 执行SQL语句
        preparedStatement.execute();

        // 关闭资源
        preparedStatement.close();
    }
}
