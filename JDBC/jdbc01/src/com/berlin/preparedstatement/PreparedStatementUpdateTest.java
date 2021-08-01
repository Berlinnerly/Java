package com.berlin.preparedstatement;

import com.berlin.jdbc.ConnectionTest;
import com.berlin.util.JDBCUtils;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class PreparedStatementUpdateTest {
    /**
     * 通用的增删改操作
     * @param sql
     * @param args
     * @throws Exception
     */
    public void update(String sql, Object ...args) throws Exception {
        Connection conn = JDBCUtils.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        for (int i = 0; i < args.length; i++) {
            ps.setObject(i + 1, args[i]);
        }
        ps.execute();
        JDBCUtils.closeResource(conn, ps);
    }


    /**
     * 修改test1表的一条记录
     */
    @Test
    public void testUpdate() {
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            // 1. 获取数据库连接
            conn = JDBCUtils.getConnection();

            // 2. 预编译SQL语句，返回PreparedStatement的实例
            String sql = "update test1 set username = ? where id = ?";
            ps = conn.prepareStatement(sql);

            // 3. 填充占位符
            ps.setObject(1, "特斯拉");
            ps.setObject(2, 2);

            // 4. 执行
            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 5. 资源的关闭
            JDBCUtils.closeResource(conn, ps);
        }
    }

    /**
     * 向test1表中添加一条记录
     * @throws IOException
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Test
    public void testInsert() throws IOException, ClassNotFoundException, SQLException {
        // 1. 读取配置文件的信息
        InputStream is = ConnectionTest.class.getClassLoader().getResourceAsStream("jdbc.properties");

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
//        System.out.println(conn);

        // 4. 预编译SQL语句，返回PreparedStatement的实例
        // ?代表占位符
        String sql = "insert into test1 (username, password) value (?, ?)";
        PreparedStatement ps = conn.prepareStatement(sql);

        // 5. 填充占位符
        ps.setString(1, "哪吒");
        ps.setString(2, "123456");

        // 6. 执行操作
        ps.execute();

        // 7. 资源的关闭
        ps.close();
        conn.close();
    }
}
