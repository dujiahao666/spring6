package com.powernode.spring6.test;

import com.powernode.spring6.dao.QIan;
import com.powernode.spring6.dao.Student;
import com.powernode.spring6.fan.OrderService;
import com.powernode.spring6.fig.Config2;
import com.powernode.spring6.lai.InterAimpl;
import com.powernode.spring6.service.CustomerService;
import com.powernode.spring6.service.PP;
import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/7 22:13
 * @description:
 */
public class RejistBean {
    @Test
    public void testRegister() {
        //自己new的对象
        Student student = new Student();
        System.out.println(student);
        //半路上纳入ioc容器
        DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        factory.registerSingleton("student", student);

        Student student1 = factory.getBean("student", Student.class);
        System.out.println(student1);
    }


    @Test
    public void testService(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowire.xml");
        CustomerService service = applicationContext.getBean("service", CustomerService.class);

        System.out.println(service);
        service.save();
    }


    @Test
    public void testInterA(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        InterAimpl interAimpl = applicationContext.getBean("interAimpl", InterAimpl.class);
        interAimpl.ce();
    }

    @Test
    public void testQian(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        QIan qian = applicationContext.getBean("daf", QIan.class);
        System.out.println(qian);
    }

    @Test
    public void testOrder(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.method1();
        orderService.method2();
    }


    @Test
    public void testQuan(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Config2.class);
        OrderService orderService = annotationConfigApplicationContext.getBean("orderService", OrderService.class);
        orderService.method3();
    }

    @Test
    public void testPP(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        PP per = applicationContext.getBean("pp", PP.class);
        System.out.println(per);
    }

}
