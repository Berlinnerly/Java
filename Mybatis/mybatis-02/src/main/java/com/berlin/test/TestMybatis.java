package com.berlin.test;

import com.berlin.bean.Emp;
import com.berlin.bean.User;
import com.berlin.mapper.EmpMapper;
import com.berlin.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/**
 * @author Berlin
 * @date 2021/2/24 15:37
 * @description
 */
public class TestMybatis {

    @Test
    public void test() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory SqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = SqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userByUid = mapper.getUserByUid("1");
        System.out.println(userByUid);
    }

    @Test
    public void testCRUD() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        // 需要手动处理事务
//        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 自动处理事务
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        // 根据Eid获取员工信息
//        Emp empByEid = mapper.getEmpByEid("1");
//        System.out.println(empByEid);
        // 获取所有员工信息
//        Map<String, Emp> allEmpMap = mapper.getAllEmpMap();
//        System.out.println(allEmpMap);
        // 添加员工信息
//        mapper.addEmp(new Emp(null, "professor", 23, "男"));
//        sqlSession.commit();
        // 修改员工信息
//        mapper.updateEmp(new Emp(2, "zhangsansan", 33, "女"));
        // 删除员工信息
//        mapper.deleteEmp("2");
    }
}
