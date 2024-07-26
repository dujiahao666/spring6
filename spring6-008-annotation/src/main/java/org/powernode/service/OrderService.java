package org.powernode.service;

import jakarta.annotation.Resource;
import org.powernode.dao.OrderDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 10:32
 * @description:
 */
@Service
public class OrderService {

//    @Resource(name="goujiao")

//    @Autowired  @Qualifier("orderDaoimplForOracl")
//    @Resource(name = "orderDaoimplForMySQL")
    @Resource
    private OrderDao orderDao;




   /* public OrderService(  OrderDao orderDao) {
        this.orderDao = orderDao;
    }*/


    public void setOrderDao( OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void save(){
        orderDao.insert();
    }
}
