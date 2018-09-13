package com.zhiyou100.student;

import lombok.Data;

/**
 * Created by Intellij IDEA
 * Description:
 * User:DongFang
 * Date:2018-09-05
 * Time:15:00
 */

@Data
public class Student {
    private int id;
    private String name;
    //与外表进行关联
    private Grade grade;
}
