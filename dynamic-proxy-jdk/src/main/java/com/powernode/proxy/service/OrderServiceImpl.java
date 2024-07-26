package com.powernode.proxy.service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 19:04
 * @description:
 */
public class OrderServiceImpl implements OrderService{
    @Override
    public void generare() {
        //模拟生成订单的耗时
        try {
            Thread.sleep(1124);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("定义已生成");
    }

    @Override
    public void modify() {
        //模拟修改订单耗时
        try {
            Thread.sleep(1346);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("订单已修改");
    }

    @Override
    public void detail() {
        //模拟查看订单耗时
        try {
            Thread.sleep(1258);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("请查看订单详情。。。");
    }

    @Override
    public String getName() {
        System.out.println("getName()方法执行了。。。");
        return "张三";
    }
}
