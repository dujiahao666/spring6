package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/8 23:41
 * @description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring6.xml")
public class SpringJuint4Test {

    @Autowired
    private User user;
    @Test
    public void testLao(){
        /*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        User user = applicationContext.getBean("user", User.class);*/
        System.out.println(user);
    }
}
