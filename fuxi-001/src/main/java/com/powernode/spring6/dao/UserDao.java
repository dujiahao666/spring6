package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/6 2:35
 * @description:
 */
public class UserDao {
    private static Logger logger= LoggerFactory.getLogger(UserDao.class);
    public void insert(){
        logger.info("数据库正在保存用户信息");
    }
}
