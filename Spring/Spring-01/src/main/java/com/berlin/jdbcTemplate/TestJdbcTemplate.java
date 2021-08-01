package com.berlin.jdbcTemplate;

import org.aspectj.lang.annotation.RequiredTypes;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Berlin
 * @date 2021/1/27 1:08
 * @description
 */
public class TestJdbcTemplate {

    ApplicationContext ac = new ClassPathXmlApplicationContext("conf/jdbc.xml");
    JdbcTemplate jdbcTemplate = ac.getBean("jdbcTemplate", JdbcTemplate.class);

    @Test
    public void testUpdate() {
//        System.out.println(jdbcTemplate);
//        jdbcTemplate.update("insert into emp value (null, 'Berlin', 18, '男')");
        String sql = "insert into emp values (null, ?, ?, ?)";
        // 单个增删改
        jdbcTemplate.update(sql, "Tokyo", 24, "女");
    }

    @Test
    public void testBatchUpdate() {
        String sql = "insert into emp values (null, ?, ?, ?)";
        ArrayList<Object> list = new ArrayList<>();
        list.add(new Object[] {"Professor", 34, "男"});
        list.add(new Object[] {"Nairobi", 26, "女"});
        list.add(new Object[] {"Rio", 28, "男"});
        // 批量增删改
        jdbcTemplate.batchUpdate(sql, String.valueOf(list));
    }

    @Test
    public void testQueryForObject() {
        // 用来获取单个的值
//        jdbcTemplate.queryForObject(sql, RequiredType)

        // 用来获取单条数据
//        jdbcTemplate.queryForObject(sql, RowMapper)


//        String sql = "select * from emp where eid = ?";
//        // 将列名和属性名进行映射
//        RowMapper<Emp> rowMapper = new BeanPropertyRowMapper<>(Emp.class);
//        Emp emp = jdbcTemplate.queryForObject(sql, new Object[]{10}, rowMapper);
//        System.out.println(emp);

        //
        String sql = "select count(*) from emp";
        Integer count = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(count);
    }

    @Test
    public void testQuery() {
        String sql = "select * from emp";
        RowMapper<Emp> rowMapper = new BeanPropertyRowMapper<>(Emp.class);
        List<Emp> list = jdbcTemplate.query(sql, rowMapper);
        for (Emp emp :
                list) {
            System.out.println(emp);
        }
    }
}
