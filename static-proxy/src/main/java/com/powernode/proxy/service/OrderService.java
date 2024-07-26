package com.powernode.proxy.service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 19:00
 * @description:
 */
public interface OrderService {
    /**
     * 生成订单
     */
    void generare();

    /**
     * 修改订单信息
     */
    void modify();


    /**
     * 查看订单详情
     */
    void detail();

}
