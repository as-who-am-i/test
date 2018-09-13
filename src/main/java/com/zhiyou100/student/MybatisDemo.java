package com.zhiyou100.student;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Intellij IDEA
 * Description:
 * User:DongFang
 * Date:2018-09-05
 * Time:16:01
 */


public class MybatisDemo {

    //mybatis配置文件路径
    private static String resource = "mybatis-config.xml";

    private static SqlSessionFactory sqlSessionFactory;

    private static SqlSession sqlSession;

    private static StudentDao studentDao;

    private static  GradeDao gradeDao = null;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //创建一个sqlSessionFactory对象，用来获取sqlSession
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
            //先打开一个会话
            sqlSession = sqlSessionFactory.openSession();
            //获取mapper，mapper是工厂dao层的实现
            studentDao = sqlSession.getMapper(StudentDao.class);
            gradeDao = sqlSession.getMapper(GradeDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        Student student = studentDao.findById(1);
        Grade grade = gradeDao.findById(1);

        System.out.println(student);
        System.out.println(grade);

    }
}
