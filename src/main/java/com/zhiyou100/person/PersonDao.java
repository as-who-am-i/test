package com.zhiyou100.person;

import java.util.List;

/**
 * Created by Intrllij IDEA
 * Description:
 * User:DongFang
 * Date:2018-09-04
 * Time:16:40
 */


public interface PersonDao {

    Person findById(int id);

    int insert(Person person);

    int update(Person person);

    int delete(int id);

    List<Person> findByPassword(String password);

    List<Person> findByCondition(String condition);

}
