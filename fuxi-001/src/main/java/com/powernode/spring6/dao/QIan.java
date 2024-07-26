package com.powernode.spring6.dao;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/8 23:43
 * @description:
 */
public class QIan {
 private String name;
 private int age;

    public QIan() {
    }

    public QIan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "QIan{name = " + name + ", age = " + age + "}";
    }
}
