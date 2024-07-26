package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/6 2:37
 * @description:
 */
public class UserService {

    private UserDao userDao;
    //set注入的话，必须提供一个set方法。spring容器会调用这个set方法给userDao属性赋值

    public void setAbc(UserDao userDao) {
        this.userDao = userDao;
        System.out.println("这里是调用set方法了");
    }

    public void saveUser(){
        userDao.insert();
    }

}
