import com.berlin.bean.Emp;
import com.berlin.mapper.ParamMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Berlin
 * @date 2021/1/27 14:45
 * @description
 */
public class TestParam {

    @Test
    public void testParam() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        ParamMapper mapper = sqlSession.getMapper(ParamMapper.class);
        mapper.insertEmp(new Emp(null, "Professor", 30, "男"));
    }
}
