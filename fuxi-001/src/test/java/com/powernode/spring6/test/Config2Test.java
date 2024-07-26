package com.powernode.spring6.test;

import com.powernode.spring6.fig.Config2;
import com.powernode.spring6.service.Aa;
import com.powernode.spring6.service.Bb;
import jakarta.annotation.Resource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/9 22:16
 * @description:
 */
public class Config2Test {
    @Test
    public void testConfig(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Config2.class);
        String ing = applicationContext.getBean("as", String.class);
        System.out.println(ing);
    }

    @Test
    public void ce2Test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Aa aa = context.getBean("aa", Aa.class);
        aa.ce2();
    }
}
