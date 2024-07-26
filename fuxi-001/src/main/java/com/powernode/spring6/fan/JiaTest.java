package com.powernode.spring6.fan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/8 9:49
 * @description:
 */
public class JiaTest {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Spring.xml");
        Jia jia = applicationContext.getBean("abcde", Jia.class);
        System.out.println(jia);
    }
}
