package com.berlin.preparedstatement;

import com.berlin.bean.Test1;
import com.berlin.util.JDBCUtils;
import org.junit.Test;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

/**
 * @Author Berlin
 * @Date 2021/1/10 7:52 星期日
 * @Description 针对于test1表的查询
 */
public class Test1ForQuery {




    @Test
    public void testQuery1() throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet resultSet = null;
        try {
            conn = JDBCUtils.getConnection();
            String sql = "select * from test1";
            ps = conn.prepareStatement(sql);

            // 执行，并返回结果集
            resultSet = ps.executeQuery();

            // 处理结果集
            // 判断结果集的下一条是否有数据，如果有数据返回true，并指针下移
            if (resultSet.next()) {
                // 获取当前数据的各个字段值
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);

                // 直接打印输出
                System.out.println("id = " + id + ", username = " + username + ", password = " + password);

                // 封装成一个集合
                Object[] data = new Object[]{id, username, password};

                // 将数据封装成一个对象（推荐）
                Test1 test1 = new Test1(id, username, password);
                System.out.println(test1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            JDBCUtils.closeResource(conn, ps);
        }

    }
}
