package com.powernode.spring6.service;

import com.powernode.spring6.dao.OrderDao;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/21 11:08
 * @description:
 */
public class OrderService {
    private OrderDao orderDao;

    //通过set方法给属性赋值


    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    /**
     * 生成订单的业务方法。。。
     */
    public void generate(){
        orderDao.insert();
    }
}
