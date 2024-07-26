package com.powernode.spring6.dao.impl;

import com.powernode.spring6.dao.UserDao;

/**
 * @author 杜嘉豪
 * @create 2024/4/19 0:34
 * @description:
 */
public class UserDaoImplForOracle implements UserDao {
    @Override
    public void deleteById() {
        System.out.println("Oracle数据库正在删除用户数据...");
    }
}
