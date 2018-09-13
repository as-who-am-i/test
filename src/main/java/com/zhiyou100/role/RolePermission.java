package com.zhiyou100.role;

import lombok.Data;

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
public class RolePermission {
    private int id;
    private int rid;
    private int pid;
}
