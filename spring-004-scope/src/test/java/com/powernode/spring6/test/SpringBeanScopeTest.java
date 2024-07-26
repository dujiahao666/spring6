package com.powernode.spring6.test;

import com.powernode.spring6.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/22 14:15
 * @description:
 */
public class SpringBeanScopeTest {
    @Test
    public void testBeanScope(){
        /**
         * 1：Spring默认情况下是如何管理这个Bean的
         *         默认情况下Bean是单例的【在Java中，单例模式是一种设计模式，用于确保一个类只有一个实例，并提供一个全局访问点以访问该实例】
         *         在Spring上下文初始化的时候实例化【解析配置文件   单例：singleton】
         *         每一次调用getBean()方法的时候，都返回那个单例的对象
         *
         * 2:也可以改变这种单例的情况
         *          在配置文件中更改设置【设置bean的作用域
         *          当改成protobean的时候，不会在直接实例化，而是在getBean的时候才去执行
         *          】
         *
         *     当bean的scope属性设置为prototype:
         *          bean是多例的
         *          spring上下文初始化的时候，并不会初始化这些propertype的bean
         *          prototype翻译为：原型
         *          【scope:prototype是多例的  singleton是单例的，或者不配置就是】
         */
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean sb = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb);
        SpringBean sb2 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb2);
        SpringBean sb3 = applicationContext.getBean("sb", SpringBean.class);
        System.out.println(sb3);
    }


    @Test
    public void testThreadScope(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");
        SpringBean sb = applicationContext.getBean("sb4", SpringBean.class);
        SpringBean sb2 = applicationContext.getBean("sb4", SpringBean.class);
        System.out.println(sb);
        System.out.println(sb2);


        //启动一个新的线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                SpringBean sb1 = applicationContext.getBean("sb4", SpringBean.class);
                System.out.println(sb1);
                SpringBean sb2 = applicationContext.getBean("sb4", SpringBean.class);
                System.out.println(sb2);
            }
        }).start();
    }
}
