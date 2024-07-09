import Mapper.PersonMapper;
import POJO.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @version 1.0
 * @Author MoDeZunZun
 * @Date 2024/7/8 17:49
 * @注释
 */
public class Test {

    @org.junit.Test
    public void TestAdd() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(is);

        SqlSession sqlSession = factory.openSession();

        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);

        Integer count = mapper.addPerson();

        sqlSession.commit();

        System.out.println(count);

    }

    @org.junit.Test
    public void TestGet() throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis-config.xml");

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();

        SqlSessionFactory factory = builder.build(is);

        SqlSession sqlSession = factory.openSession(true);

        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);

        Person person = mapper.getPerson();

        System.out.println(person);

    }
}
