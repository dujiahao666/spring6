package com.powernode.proxy.service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/4 11:28
 * @description:
 */
public class UserService {
    public boolean login(String username, String password) {
        System.out.println("系统正在验证身份。。。");
        if ("admin".equals(username) && "123".equals(password)) {
            return true;
        }
        return false;
    }

    public void logout(){
        System.out.println("系统正在退出。。。");
    }
}
