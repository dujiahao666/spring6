package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/24 21:22
 * @description:
 */
public class Wife {
    private String name;
    private Husband husband;

    public void setName(String name) {
        this.name = name;
    }

    public void setHusband(Husband husband) {
        this.husband = husband;
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", husband=" + husband.getName() +
                '}';
    }

    public String getName() {
        return name;
    }

    public Husband getHusband() {
        return husband;
    }
}
