package com.powernode.proxy.client;

import com.powernode.proxy.service.TimerMethodInterceptor;
import com.powernode.proxy.service.UserService;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/4 11:31
 * @description:
 */
public class Client {
    public static void main(String[] args) {
        //创建字节码增强器对象
        //这个对象是CGlib库当中的核心对象，就是依靠它来生成代理类的
        Enhancer enhancer=new Enhancer();

        //告诉CGLIB父类是谁，告诉CGlib目标是谁
        enhancer.setSuperclass(UserService.class);

        //设置回调（等同于JDK动态代理当中的调用处理器。InvocationHandler）
        enhancer.setCallback(new TimerMethodInterceptor());

        //创建代理对象
        //这一步会做两件事
        //第一件事：在内存中生成UserService类的子类，其实就是代理类的字节码
        //第二件事：创建代理对象
        // 父类是UserService , 子类这个代理类一定是UserService
        UserService userServiceProxy = (UserService)enhancer.create();

        //调用代理对象的代理方法
        boolean success = userServiceProxy.login("admin", "123");
        System.out.println(success?"登录成功":"登录失败");
        userServiceProxy.logout();

    }
}
