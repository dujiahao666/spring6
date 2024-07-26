package com.powernode.test;

import com.powernode.ShowTime;
import com.powernode.Stu;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/9 23:03
 * @description:
 */
public class StuTest {
    @Test
    public void testC1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
//        Stu stu = applicationContext.getBean("st", Stu.class);
//        System.out.println(stu);
        ShowTime tim = applicationContext.getBean("tim", ShowTime.class);
        System.out.println(tim);
    }
}
