package com.powernode.spring6.test;


import com.powernode.spring6.dao.Person;
import com.powernode.spring6.dao.Person2;
import com.powernode.spring6.dao.Student;
import com.powernode.spring6.dao.User;
import com.powernode.spring6.service.CustomerService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/6 2:01
 * @description:
 */
public class FisrtSpringTest {
    @Test
    public void testFirstSpringCode(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
//        CustomerService custo = applicationContext.getBean("custo", CustomerService.class);
//        custo.save();
        Person per = applicationContext.getBean("per", Person.class);
        System.out.println(per);
    }


    @Test
    public void testDate(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Person2 person2 = applicationContext.getBean("person2", Person2.class);
        System.out.println(person2);
    }


    @Test
    public void testNalai(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User nalai = applicationContext.getBean("nalai", User.class);
        System.out.println("第6步:使用bean："+nalai);
        ClassPathXmlApplicationContext applicationContext1=(ClassPathXmlApplicationContext)  applicationContext;
        applicationContext1.close();
    }




}
