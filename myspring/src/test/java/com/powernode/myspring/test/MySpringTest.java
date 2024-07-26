package com.powernode.myspring.test;

import com.powernode.myspring.bean.User;
import com.powernode.myspring.bean.UserService;
import org.junit.Test;
import org.myspringframework.core.ApplicationContext;
import org.myspringframework.core.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 16:10
 * @description:
 */
public class MySpringTest {

    @Test
    public void testMySpring(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Object uesr = applicationContext.getBean("user");
        System.out.println(uesr);
        UserService userService = (UserService) applicationContext.getBean("userService");
       userService.save();
    }
}
