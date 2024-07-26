package com.powernode.spring6.service;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.VipDao;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/21 1:00
 * @description:
 */
public class CustomerService {
    private UserDao userDao;
    private VipDao vipDao;

    public CustomerService() {
    }

    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setVipDao(VipDao vipDao) {
        this.vipDao = vipDao;
    }

    public void save(){
        userDao.insert();
        vipDao.insert();
    }
}
