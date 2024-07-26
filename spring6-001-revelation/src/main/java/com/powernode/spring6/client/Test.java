package com.powernode.spring6.client;

import com.powernode.spring6.service.UserService;
import com.powernode.spring6.web.UserAction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @create 2024/4/19 0:30
 * @description:
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserService impl = applicationContext.getBean("impl", UserService.class);
        impl.deleteUser();
       /* UserAction userAction=new UserAction();
        userAction.deleteRequest();*/
        System.out.println("=================");
        ApplicationContext applicationContext2=new ClassPathXmlApplicationContext("spring.xml");
        UserService impl2 = applicationContext.getBean("impl2", UserService.class);
        impl2.deleteUser();
    }
}
