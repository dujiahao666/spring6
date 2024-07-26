package com.powernode.spring6.bean;

import org.springframework.context.annotation.Bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/19 11:04
 * @description: 这是一个Bean,封装了用户的信息。Spring可以帮助我们创建User对象吗？
 */
public class User {
    public User() {
        System.out.println("User无参构造方法执行了");
    }
}
