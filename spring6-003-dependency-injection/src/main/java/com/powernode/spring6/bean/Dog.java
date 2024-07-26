package com.powernode.spring6.bean;

import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/21 21:41
 * @description:
 */
public class Dog {
    //简单类型
    private String name;
    private int age;

    //非简单类型
    private Date birth;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birth=" + birth +
                '}';
    }
}
