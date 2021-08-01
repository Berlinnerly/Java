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
 * @Date 2021/1/10 8:56 星期日
 * @Description
 */
public class TongYongChaXun {
    /**
     * 针对于Test1表的通用查询操作
     *
     * @param sql
     * @param args
     * @return
     * @throws Exception
     */
    @Test
    public Test1 queryForTest1(String sql, Object... args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            conn = JDBCUtils.getConnection();
            ps = conn.prepareStatement(sql);

            for (int i = 0; i < args.length; i++) {
                ps.setObject(i + 1, args[i]);
            }

            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int columnCount = rsmd.getColumnCount();
            if (rs.next()) {
                Test1 Test1 = new Test1();
                for (int i = 0; i < columnCount; i++) {
                    Object columnValue = rs.getObject(i + 1);

                    // 获取每个列的列名
                    String columnName = rsmd.getColumnName(i + 1);

                    Field field = Test1.class.getDeclaredField(columnName);

                    field.setAccessible(true);
                    field.set(Test1, columnValue);
                }
                return Test1;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.closeResources(conn, ps, rs);
        }
        return null;
    }
}
