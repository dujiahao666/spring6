package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/6 2:35
 * @description:
 */
public class VipDao {
    private static Logger logger= LoggerFactory.getLogger(VipDao.class);
    public void insert(){
        logger.info("Vip正在加密保存用户信息");
    }
}
