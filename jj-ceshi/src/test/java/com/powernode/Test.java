package com.powernode;

import com.powernode.service.Nao;
import com.powernode.service.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 16:41
 * @description:
 */
public class Test {

    @org.junit.Test
    public void testAs(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring6.xml");
       /* Student stu = applicationContext.getBean("stu", Student.class);
        stu.c1();
        stu.c2();*/
        Nao chu = applicationContext.getBean("chu", Nao.class);
        System.out.println(chu);
    }


}
