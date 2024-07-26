package com.powernode.spring6.test;

import com.powernode.spring6.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 13:53
 * @description:
 */
public class BeanInstantiationTest {
    @Test
    public void testInstantiation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userSe = applicationContext.getBean("userSe", UserService.class);
        userSe.save();
    }
}
