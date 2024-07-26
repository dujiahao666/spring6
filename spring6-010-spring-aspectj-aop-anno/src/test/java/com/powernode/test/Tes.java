package com.powernode.test;

import com.powernode.service.Login;
import com.powernode.service.OrderService;
import com.powernode.service.Quan;
import com.powernode.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/29 18:29
 * @description:
 */
public class Tes {
    @Test
    public void test1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Login login = applicationContext.getBean("login", Login.class);
        login.jiaru();
        System.out.println("================");
        login.logout();
    }

    @Test
    public void test2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
       /*UserService userService = applicationContext.getBean("userService", UserService.class);
       userService.login();
       userService.logout();*/


        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }


    @Test
    public void test3(){
       ApplicationContext applicationContext= new  AnnotationConfigApplicationContext(Quan.class);
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
    }
}


