package com.zhiyou100.auto.entity;

import com.zhiyou100.role.PermissionDao;
import com.zhiyou100.role.RoleDao;
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


public class AutoCodeTest {

    private static String resource = "mybatis-config.xml";

    private static SqlSessionFactory sqlSessionFactory;

    private static SqlSession sqlSession;


    static {
        try {
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //创建一个sqlSessionFactory对象，用来获取sqlSession
            sqlSessionFactory= new SqlSessionFactoryBuilder().build(inputStream);
            //先打开一个会话
            sqlSession = sqlSessionFactory.openSession();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        Role role = roleMapper.selectByPrimaryKey(1);
        System.out.println(role);

        PermissionMapper permissionMapper = sqlSession.getMapper(PermissionMapper.class);
        Permission permission = permissionMapper.selectByPrimaryKey(1);
        System.out.println(permission);


    }
}
