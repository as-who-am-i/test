package com.zhiyou100.student;

import lombok.Data;

import java.util.List;

/**
 * Created by Intellij IDEA
 * Description:
 * User:DongFang
 * Date:2018-09-05
 * Time:15:00
 */

@Data
public class Grade {
    private int id;
    private String name;
    //一对多
    private List<Student> studentList;
}
