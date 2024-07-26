package com.powernode.myspring.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 15:21
 * @description:
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.insert();
    }

}
