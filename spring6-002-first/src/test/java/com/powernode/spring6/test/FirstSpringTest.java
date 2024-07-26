package com.powernode.spring6.test;

import com.powernode.spring6.dao.UserDaoImplForMySQL;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/19 11:25
 * @description: 测试
 */
public class FirstSpringTest {
    @Test
    public void testFirstSpringCode() {
        //第一步：获取Spring容器对象
        //ApplicationContext 翻译为： 应用上下文。其实就是Spring容器
        //ApplicationContext 是一个接口
        //ApplicationContext 接口下有很多实现类，其中有一个叫ClassPathXmlApplicationContext
        //ClassPathXmlApplicationContext 专门从类路径当中加载spring配置文件的一个Spirng上下文对象

        //这行代码只要执行：就相当于启动了Spring容器，解析spring.xml文件，并且实例化所有的bean对象，放到spring容器当中。
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        /*ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext applicationContext=(ApplicationContext) classPathXmlApplicationContext;*/

        //第二步：根据bean的id从Spring容器中获取这个对象
     /*   Object userBean = applicationContext.getBean("userBean");
        Object userDao = applicationContext.getBean("userDao");
        System.out.println(userBean);
        System.out.println(userDao);*/

//        Date time = (Date)applicationContext.getBean("ss2");


      /*  Date time = applicationContext.getBean("ss2", Date.class);
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String format = simpleDateFormat.format(time);
        System.out.println(format);*/


        UserDaoImplForMySQL userDao = applicationContext.getBean("userDao", UserDaoImplForMySQL.class);
        userDao.cun();
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);
        logger.info("结束了，没有任何问题");
    }
}
