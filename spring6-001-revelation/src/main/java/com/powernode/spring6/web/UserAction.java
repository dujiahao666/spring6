package com.powernode.spring6.web;

import com.powernode.spring6.service.UserService;
import com.powernode.spring6.service.impl.UserServiceImpl;

/**
 * @author 杜嘉豪
 * @create 2024/4/19 0:12
 * @description: 表示层
 */
public class UserAction {
    private UserService userService=new UserServiceImpl();

    /**
     * 删除用户信息的请求
     */
    public void deleteRequest(){
        userService.deleteUser();
    }
}
