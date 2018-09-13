package com.zhiyou100.role;

import com.zhiyou100.student.GradeDao;
import com.zhiyou100.student.StudentDao;
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
 * Time:19:32
 */


public class MybatisHomeWork {

    private static String resource = "mybatis-config.xml";

    private static SqlSessionFactory sqlSessionFactory;

    private static SqlSession sqlSession;

    private static RoleDao roleDao;

    private static PermissionDao permissionDao;

    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //创建一个sqlSessionFactory对象，用来获取sqlSession
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
            //先打开一个会话
            sqlSession = sqlSessionFactory.openSession();
            //获取mapper，mapper是工厂dao层的实现
            roleDao = sqlSession.getMapper(RoleDao.class);
            permissionDao = sqlSession.getMapper(PermissionDao.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Role role = roleDao.findById(1);

        System.out.println(role);

        Permission permission = permissionDao.findByPid(2);

        System.out.println(permission);


    }
}
