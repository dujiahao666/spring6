package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/21 22:40
 * @description:
 */
public class People {
    private String name;
    private int age;
    private boolean sex;

    //c命名空间是简化构造注入的

    public People() {
    }

    public People(String name, int age, boolean sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
