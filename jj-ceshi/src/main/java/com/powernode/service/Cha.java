package com.powernode.service;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.SmartInitializingSingleton;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/7 8:25
 * @description:
 */
@Component
public class Cha {
    @Resource(name = "wifeaa")
    private  Wife wife;


    public void show(){
        wife.show();
        System.out.println(wife.getShu());
    }
}



class ce{
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring6.xml");
        Cha cha = applicationContext.getBean("cha", Cha.class);
        cha.show();

    }
}