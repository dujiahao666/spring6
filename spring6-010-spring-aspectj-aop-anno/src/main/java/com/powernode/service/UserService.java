package com.powernode.service;

import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/5 12:59
 * @description:
 */
@Service("userService")
public class UserService {
    public void login(){
        System.out.println("系统正在进行身份验证...");
    }

    public void logout(){
        System.out.println("退出系统...");
    }
}
