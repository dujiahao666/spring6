package com.powernode.spring6.test;

import com.powernode.spring6.bean.User;
import com.powernode.spring6.bean.Wo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 14:21
 * @description:
 */
public class Test {
    @org.junit.Test
    public void testUser(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user = applicationContext.getBean("user", User.class);
        System.out.println("第六步：使用bean"+user);
        //必须手动关闭Spring容器，这样Spring容器才会销毁Bean(会自动调用destory方法)
        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext) applicationContext;
        context.close();
    }

    @org.junit.Test
    public void testWo(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        Wo www = applicationContext.getBean("www", Wo.class);
        System.out.println("正在被使用");
    }


}
