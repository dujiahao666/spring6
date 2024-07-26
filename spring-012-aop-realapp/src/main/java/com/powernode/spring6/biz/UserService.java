package com.powernode.spring6.biz;

import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 19:45
 * @description:
 */
@Service
public class UserService {

    public void saveUser(){
        System.out.println("新增用户信息");
    }

    public void deleteUser(){
        System.out.println("删除用户信息");
    }

    public void modifyUser(){
        System.out.println("修改用户信息");
    }

    public void getUser(){
        System.out.println("获取用户信息");
    }

}
