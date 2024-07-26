package com.powernode.spring6.service.impl;

import com.powernode.spring6.dao.UserDao;
import com.powernode.spring6.dao.impl.UserDaoImplForMySQL;
import com.powernode.spring6.dao.impl.UserDaoImplForOracle;
import com.powernode.spring6.service.UserService;

/**
 * @author 杜嘉豪
 * @create 2024/4/19 0:20
 * @description:
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao ;


    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void deleteUser() {
        userDao.deleteById();
        //处理业务的代码...
    }


    public void ce(){
        setUserDao(new UserDaoImplForMySQL());
        setUserDao(new UserDaoImplForOracle());
    }
}
