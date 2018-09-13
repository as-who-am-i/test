package com.zhiyou100.person;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Intrllij IDEA
 * Description:
 * User:DongFang
 * Date:2018-09-04
 * Time:16:39
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
//将sql语句集中写在配置文件，与代码相分离，利于维护
public class Person {
    private int id;
    private String username;
    private String password;
}
