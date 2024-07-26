package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.OrderServiceImplSub;
import com.powernode.proxy.service.OrderServiceProxy;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 19:08
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        //创建目标对象
        OrderService orderService=new OrderServiceImpl();
        //创建代理对象
        OrderService orderService1=new OrderServiceProxy(orderService);
        //调用代理对象的代理方法
        //我们使用的还是接口的方法，客户端察觉不到差距
        orderService1.generare();
        orderService1.detail();
        orderService1.modify();


        /*OrderServiceImplSub serviceImplSub=new OrderServiceImplSub();
        serviceImplSub.generare();
        serviceImplSub.detail();
        serviceImplSub.modify();*/
    }
}
