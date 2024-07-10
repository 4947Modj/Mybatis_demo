import Mapper.PersonMapper;
import POJO.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import utils.SqlSessionUtil;

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

    @org.junit.Test
    public void TestParameter(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        Person person = mapper.getPersonById(2);
        System.out.println(person);
    }

    @org.junit.Test
    public void TestParameters(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        Person person = mapper.checkLogin("lili",0);
        System.out.println(person);
    }

    @org.junit.Test
    public void TestParameterWithParam(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        PersonMapper mapper = sqlSession.getMapper(PersonMapper.class);
        Integer count= mapper.updatePerson("lili");
        System.out.println(count);
    }
}
