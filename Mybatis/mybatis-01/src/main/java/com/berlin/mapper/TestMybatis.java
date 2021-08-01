package com.berlin.mapper;

import com.berlin.bean.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Berlin
 * @date 2021/1/25 23:48
 * @description
 */
public class TestMybatis {

    @Test
    public void test() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
//        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession();

        // getMapper()：会通过动态代理，动态生成UserMapper的代理实现类
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        System.out.println(mapper.getClass().getName());

        User user = mapper.getUserByUid("1");
        System.out.println(user);
    }
}
