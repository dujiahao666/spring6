package com.powernode.spring6.test;

import com.powernode.spring6.bean.Order;
import com.powernode.spring6.bean.Student;
import com.powernode.spring6.bean.User;

import com.powernode.spring6.bean.Vipwe;
import com.powernode.spring6.bean2.A;
import com.powernode.spring6.bean2.B;
import com.powernode.spring6.bean2.C;
import com.powernode.spring6.bean3.MyDataSource;
import org.junit.Test;
import org.powernode.SpringKaihua;
import org.powernode.service.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 8:27
 * @description:
 */
public class TestAnnotation {
    @Test
    public void testAnno1(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);
        Vipwe vipBean = applicationContext.getBean("vipBean", Vipwe.class);
        System.out.println(vipBean);
        Student studnetBean = applicationContext.getBean("student", Student.class);
        System.out.println(studnetBean);
        Order orderBean = applicationContext.getBean("order", Order.class);
        System.out.println(orderBean);
    }


    @Test
    public void Anno2(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-choose.xml");
        A a = applicationContext.getBean("a", A.class);
        System.out.println(a);
        B b = applicationContext.getBean("b", B.class);
        System.out.println(b);
       /* C c = applicationContext.getBean("c", C.class);
        System.out.println(c);*/
    }

    @Test
    public void spring_di_Annotation(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-di-annotation.xml");
        /*MyDataSource myDataSource = applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);*/
        com.powernode.spring6.bean3.User user = applicationContext.getBean("user", com.powernode.spring6.bean3.User.class);
        System.out.println(user);
    }


    @Test
    public void AutowiredTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowired.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        System.out.println(orderService);
        orderService.save();
    }

    @Test
    public void AutowiredTest2(){
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-autowired.xml");
        ApplicationContext applicationContext1=new AnnotationConfigApplicationContext(SpringKaihua.class);
        OrderService orderService = applicationContext1.getBean("orderService", OrderService.class);
        System.out.println(orderService);
        orderService.save();
    }
}
