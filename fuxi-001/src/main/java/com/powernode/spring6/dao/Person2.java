package com.powernode.spring6.dao;

import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/7 20:50
 * @description:
 */
public class Person2 {
    private String name;
    private Date date;

    public Person2() {
    }

    public Person2(String name, Date date) {
        this.name = name;
        this.date = date;
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
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }

    public String toString() {
        return "Person2{name = " + name + ", date = " + date + "}";
    }
}
