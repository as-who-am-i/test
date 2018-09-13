package com.zhiyou100.role;

/**
 * Created by Intellij IDEA
 * Description:根据角色可以查出该角色拥有的权限
 * User:DongFang
 * Date:2018-09-05
 * Time:19:12
 */


public interface RoleDao {
    Role findById(int id);
}
