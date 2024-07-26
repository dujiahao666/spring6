package com.powernode.spring6.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/8 23:40
 * @description:
 */
@Component
public class User {
    @Value("张三")
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "User{name = " + name + "}";
    }
}
