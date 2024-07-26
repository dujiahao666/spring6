package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/20 23:07
 * @description:
 */
public class UserDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDao.class);

    public void insert() {
//        System.out.println("数据库正在保存用户信息");
        LOGGER.info("数据库正在保存用户信息");
    }
}
