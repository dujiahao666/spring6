package com.powernode.myspring.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 15:19
 * @description:
 */
public class User {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
