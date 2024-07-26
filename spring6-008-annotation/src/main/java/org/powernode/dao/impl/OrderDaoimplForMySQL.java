package org.powernode.dao.impl;

import org.powernode.dao.OrderDao;
import org.springframework.stereotype.Repository;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 10:30
 * @description:
 */
//@Repository("goujiao")
@Repository("orderDao232")
public class OrderDaoimplForMySQL implements OrderDao {
    @Override
    public void insert() {
        System.out.println("Mysql数据库正在保存用户信息...");
    }
}
