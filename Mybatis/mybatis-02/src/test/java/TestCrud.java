import com.berlin.mapper.EmpMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Berlin
 * @date 2021/1/26 13:53
 * @description
 */
public class TestCrud {

    @Test
    public void testCrud() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = build.openSession(true);
        EmpMapper empMapper = sqlSession.getMapper(EmpMapper.class);
        // 测试
//        Emp emp = empMapper.getEmpByEid("2");
//        System.out.println(emp);

//        List<Emp> allEmp = empMapper.getAllEmp();
//        System.out.println(allEmp);
//        for (Emp em :
//                allEmp) {
//            System.out.println(em);
//        }

//        empMapper.addEmp(new Emp(null, "feifei", 22, "女"));
//        sqlSession.commit();

//        Boolean b = empMapper.updateEmp(new Emp(2, "小胡", 14, "女"));
//        System.out.println(b);

//        empMapper.deleteEmp("2");

//        Integer count = empMapper.getCount();
//        System.out.println(count);

    }
}
