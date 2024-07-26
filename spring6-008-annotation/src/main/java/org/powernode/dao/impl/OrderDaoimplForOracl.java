package org.powernode.dao.impl;

import org.powernode.dao.OrderDao;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 11:01
 * @description:
 */
//@Component("ssd")
public class OrderDaoimplForOracl implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Oracl数据库正在保存用户信息...");
    }
}
