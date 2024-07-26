package com.powernode.proxy.client;

import com.powernode.proxy.service.OrderService;
import com.powernode.proxy.service.OrderServiceImpl;
import com.powernode.proxy.service.ProxyUtil;
import com.powernode.proxy.service.TimerInvokectionHandler;

import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 22:51
 * @description: 客户端程序
 */
public class Client {
    public static void main(String[] args) {
        //创建目标对象
        OrderService targer=new OrderServiceImpl();
        //创建代理对象
        //Object proxyObj = Proxy.newProxyInstance(类加载器， 代理类要实现的接口，调用处理器 )；
        /**
         * newProxyInstance 翻译为: 新建代理对象
         * 也就是说，通过调用这个方法可以创建代理对象
         * 本质上，这个proxy.newProxyInstance()方法的执行，做了两件事：
         *       第一件事:在内存中动态生成了一个代理类的字节码class
         *       第二件事：new对象了。通过内存中代理类这个代码，实例化了代理对象。
         */
//        Proxy proxy=Proxy.newProxyInstance(orderService.getClass().getClassLoader(), orderService.getClass().getInterfaces(),)
//        OrderService object=(OrderService)Proxy.newProxyInstance(targer.getClass().getClassLoader(), targer.getClass().getInterfaces(),new TimerInvokectionHandler(targer));
        OrderService object= (OrderService)ProxyUtil.newProxyInstance(targer);
        object.modify();
        object.generare();
        object.detail();
       String str=object.getName();
        System.out.println(str);
    }
}
