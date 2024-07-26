package com.powernode.spring6.test;

import com.powernode.spring6.bean.Husband;
import com.powernode.spring6.bean.Wife;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/24 21:28
 * @description:
 */
public class Test {
    @org.junit.Test
    public void testDepend(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Husband has = applicationContext.getBean("has", Husband.class);
        Husband has2 = applicationContext.getBean("has", Husband.class);
        System.out.println(has);
        Wife wife = applicationContext.getBean("wife", Wife.class);
        System.out.println(wife);
        System.out.println("================");
    }

    @org.junit.Test
    public void na() throws Exception{
        Class<?> aClass = Class.forName("com.powernode.spring6.bean.Wife");
        Object obj = aClass.getDeclaredConstructor().newInstance();
        Field name = aClass.getDeclaredField("name");
        System.out.println(name.getType());
        //通过反射获取的属性字段，通过getType返回的是 类型【类型字节码】
        Class<?> type = name.getType();
        System.out.println(type.toString());
        System.out.println("=========");


    }
}
