package com.powernode.spring6.bean;

import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 8:23
 * @description:
 */
@Component(value = "userBean")
public class User {
    public User() {
        System.out.println("无参构造方法执行了。。。");
    }
}
