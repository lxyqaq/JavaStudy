package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.example.model.Users;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName TestMybatis
 * @Description TODO
 * @Author lxyqaq @Email A00279565@student.ait.ie
 * @Date 2020/12/30 22:14
 * @Version 1.0
 */
public class TestMybatis {

    @Test
    public void testLoadById() throws IOException {
        Integer id = 2;
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        Users users = (Users) session.selectOne("org.example.dao.UsersMapper.loadById", id);
        System.out.println(users);
    }

}
