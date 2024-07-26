package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 17:25
 * @description:
 */
public class Wo {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Wo{" +
                "name='" + name + '\'' +
                '}';
    }

    public Wo() {
    }
}
