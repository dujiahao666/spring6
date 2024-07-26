package com.powernode.spring6.bean;

import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 14:15
 * @description:
 */
public class Stundent {
    private String name;
    private Date date;

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Stundent{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
