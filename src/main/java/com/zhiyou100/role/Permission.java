package com.zhiyou100.role;

import lombok.Data;

import java.util.List;

/**
 * Created by Intellij IDEA
 * Description:
 * 请完成以下操作
 *      a.	根据角色可以查出该角色拥有的权限
 *      b.	根据权限可以查出有多少角色拥有该权限
 * User:DongFang
 * Date:2018-09-05
 * Time:18:50
 */

@Data
public class Permission {
    private int id;
    private String name;
    private List<Role> roleList;
    private RolePermission rolePermission;
}
