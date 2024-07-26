package com.powernode.spring6.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/21 11:06
 * @description:
 */
public class OrderDao {
    private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);

    public void insert(){
        logger.info("订单正在生成...");
    }
}
