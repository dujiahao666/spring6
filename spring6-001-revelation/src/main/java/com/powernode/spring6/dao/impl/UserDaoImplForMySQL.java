package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

/**
 * @author 杜嘉豪
 * @create 2024/4/19 0:18
 * @description:
 */
public class UserDaoImplForMySQL implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("MySQL数据库正在删除用户信息...");
    }
}
