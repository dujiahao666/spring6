package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 14:41
 * @description:
 */
public class Zi {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Zi{" +
                "name='" + name + '\'' +
                '}';
    }
}
