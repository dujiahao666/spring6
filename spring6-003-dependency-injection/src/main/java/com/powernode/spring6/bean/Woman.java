package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/21 15:45
 * @description:
 */
public class Woman {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                '}';
    }
}
