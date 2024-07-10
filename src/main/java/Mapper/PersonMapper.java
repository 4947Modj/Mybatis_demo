package Mapper;

import POJO.Person;
import org.apache.ibatis.annotations.Param;

/**
 * @version 1.0
 * @Author MoDeZunZun
 * @Date 2024/7/8 17:27
 * @注释
 */
public interface PersonMapper {

    Integer addPerson();

    Person getPerson();

    Person getPersonById(Integer id);

    Person checkLogin(String username,Integer password);

    Integer updatePerson(@Param("username") String username);


}
