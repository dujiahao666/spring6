package com.powernode.spring.test;

import com.powernode.spring.bean.*;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 0:14
 * @description:
 */
public class BeanInstatiationTest {

    @Test
    public void testInstantiation1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        SpringBean sb = context.getBean("sb", SpringBean.class);
        System.out.println(sb);
        Star starBean = context.getBean("starBean", Star.class);
        System.out.println(starBean);
    }


    @Test
    public void testFactoryBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Gun gun = context.getBean("gun", Gun.class);
        //这里之所以返回的是Person.class是因为最终执行的是get()这个方法，返回的是gun对象
        System.out.println(gun);
    }


    @Test
    public void testPerson() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person person = applicationContext.getBean("person", Person.class);
        //这里之所以返回的是Person.class是因为最终执行的是getObject()这个方法，返回的是Person对象
        System.out.println(person);
        Person person2 = applicationContext.getBean("person", Person.class);
        System.out.println(person2);
    }


    @Test
    public void teststu() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Student stu = context.getBean("stu", Student.class);
        System.out.println(stu);
        Student stu2 = context.getBean("stu2", Student.class);
        System.out.println(stu2);
    }


    @Test
    public void testce() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Ce ce = context.getBean("ce", Ce.class);
        System.out.println(ce);
        Ce ce2 = context.getBean("ce", Ce.class);
        System.out.println(ce2);
        System.out.println("第四步:使用");
        ClassPathXmlApplicationContext classPathXmlApplicationContext = (ClassPathXmlApplicationContext) context;
        classPathXmlApplicationContext.close();
    }
}


