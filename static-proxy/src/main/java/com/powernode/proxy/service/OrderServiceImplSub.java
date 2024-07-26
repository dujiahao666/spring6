package com.powernode.proxy.service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 19:25
 * @description:
 */
public class OrderServiceImplSub extends OrderServiceImpl{
    @Override
    public void generare() {
        long star = System.currentTimeMillis();
        super.generare();
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-star)+"毫秒");
    }

    @Override
    public void modify() {
        long star = System.currentTimeMillis();
        super.modify();
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-star)+"毫秒");
    }

    @Override
    public void detail() {
        long star = System.currentTimeMillis();
        super.detail();
        long end = System.currentTimeMillis();
        System.out.println("共耗时："+(end-star)+"毫秒");
    }
}
