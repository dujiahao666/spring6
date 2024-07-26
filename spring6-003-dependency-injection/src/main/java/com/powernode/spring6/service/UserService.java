package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/20 23:11
 * @description:
 */
public class UserService {
    private UserDao userDao;

    //set注入的话，必须提供一个set方法
    //Spring容器会调用这个set方法，来给userDao属性赋值


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(){
        //保存用户信息到数据库
        userDao.insert();
    }
}
