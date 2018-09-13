package com.zhiyou100.role;

/**
 * Created by Intellij IDEA
 * Description:根据权限可以查出有多少角色拥有该权限
 * User:DongFang
 * Date:2018-09-05
 * Time:20:44
 */


public interface PermissionDao {
    Permission findByPid(int id);

}
