package com.zhiyou100.person;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Intellij IDEA
 * Description:
 * User:DongFang
 * Date:2018-09-04
 * Time:16:23
 */


public class MybatisDemo {

    //mybatis配置文件路径
    private static String resource = "mybatis-config.xml";

    private static SqlSessionFactory sqlSessionFactory;

    private static SqlSession sqlSession;

    private static PersonDao personDao;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //创建一个sqlSessionFactory对象，用来获取sqlSession
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
            //先打开一个会话
            sqlSession = sqlSessionFactory.openSession();
            //获取mapper，mapper是工厂dao层的实现
            personDao = sqlSession.getMapper(PersonDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {

        //PersonFindById();

        //PersonInsert();

        //PersonUpdate();

        //PersonDelete();

        PersonFindByPassword();

    }

    private static void PersonFindByPassword() {
        List<Person> personList = personDao.findByPassword("e10adc3949ba59abbe56e057f20f883e");
        for (Person person :
                personList) {
            System.out.println(person);
        }
    }

    private static void PersonDelete() {
        int row = personDao.delete(12);
        sqlSession.commit();
        System.out.println(row);
    }

    private static void PersonUpdate() {
        int row = personDao.update(new Person(1, "tom", "e10adc3949ba59abbe56e057f20f883e"));
        sqlSession.commit();
        System.out.println(row);
    }

    private static void PersonInsert() {
        //在改变数据库的时候要用session进行提交
        int row = personDao.insert(new Person(11, "jerry", "e10adc3949ba59abbe56e057f20f883e"));
        sqlSession.commit();
        System.out.println(row);
    }

    private static void PersonFindById() {
        Person person = personDao.findById(1);
        System.out.println(person);
    }


}
