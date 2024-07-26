package com.powernode.spring6.test;

import com.powernode.spring6.bean.*;
import com.powernode.spring6.jdbc.MyDataSource1;
import com.powernode.spring6.jdbc.MyDataSource2;
import com.powernode.spring6.jdbc.MyDateSource;
import com.powernode.spring6.service.CustomerService;
import com.powernode.spring6.service.OrderService;
import com.powernode.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/20 23:18
 * @description:
 */
public class SpringDITest {
    @Test
    public void testSetDI() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring6.xml");
        UserService userServiceBean = applicationContext.getBean("userServiceBean", UserService.class);
        userServiceBean.saveUser();
    }

    @Test
    public void testSetCon() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        CustomerService csBean = applicationContext.getBean("csBean", CustomerService.class);
        csBean.save();
    }

    @Test
    public void wai() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        OrderService orse = applicationContext.getBean("orse", OrderService.class);
        orse.generate();
        OrderService orderServiceBean2 = applicationContext.getBean("orderServiceBean2", OrderService.class);
        orderServiceBean2.generate();
    }

    @Test
    public void setDI2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
    }

    @Test
    public void setDi3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        SimpleValueType svt = applicationContext.getBean("svt", SimpleValueType.class);
        System.out.println(svt);
        System.out.println(svt.getUsername());
        System.out.println(new Date());
    }


    @Test
    public void testMyDataSource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Object myDataSource = applicationContext.getBean("myDataSource");
        System.out.println(myDataSource);
    }


    @Test
    public void testCascade() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("cascade.xml");
        Studnet studentBean = applicationContext.getBean("studnetBean", Studnet.class);
        System.out.println(studentBean);
        Clazz clazzBean = applicationContext.getBean("clazzBean", Clazz.class);
        System.out.println(clazzBean);
    }


    @Test
    public void testyuQian() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-array.xml");
        QianDaYe yuQian = applicationContext.getBean("yuQian", QianDaYe.class);
        System.out.println(yuQian);
    }

    @Test
    public void testPowerBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        Person powerBean = applicationContext.getBean("powerBean", Person.class);
        System.out.println(powerBean);
    }

    @Test
    public void testCatBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Cat catBean = applicationContext.getBean("catBean", Cat.class);
        System.out.println(catBean);
    }

    @Test
    public void testMatbBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        MathBean mathBean = applicationContext.getBean("mathBean", MathBean.class);
        System.out.println(mathBean);
    }


    @Test
    public void testdogBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Dog dogBean = applicationContext.getBean("dogBean", Dog.class);
        System.out.println(dogBean);
        Dog dogBean2 = applicationContext.getBean("dogBean2", Dog.class);
        System.out.println(dogBean2);
        Dog dogBean3 = applicationContext.getBean("dogBean3", Dog.class);
        System.out.println(dogBean3);
    }

    @Test
    public void testpeopleBean() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-c.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        People peopleBean2 = applicationContext.getBean("peopleBean2", People.class);
        System.out.println(peopleBean);
        System.out.println(peopleBean2);
        Dog dogBean2 = applicationContext.getBean("dogBean2", Dog.class);
        System.out.println(dogBean2);
    }


    @Test
    public void testSource() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");
        MyDataSource1 source1 = applicationContext.getBean("source1", MyDataSource1.class);
        MyDataSource2 source2 = applicationContext.getBean("source2", MyDataSource2.class);
        System.out.println(source1);
        System.out.println(source2);
    }

    @Test
    public void testorser() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        OrderService orser = applicationContext.getBean("orser", OrderService.class);
        orser.generate();
        OrderService orser2 = applicationContext.getBean("orser2", OrderService.class);
        orser2.generate();
        System.out.println("================");
        CustomerService customerServiceBean = applicationContext.getBean("customerServiceBean", CustomerService.class);
        customerServiceBean.save();
        System.out.println("======================");
        CustomerService customerServiceBean2 = applicationContext.getBean("customerServiceBean2", CustomerService.class);
        customerServiceBean2.save();
    }



    @Test
    public void testds(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDateSource ds = applicationContext.getBean("ds", MyDateSource.class);
        System.out.println(ds);
    }
}
