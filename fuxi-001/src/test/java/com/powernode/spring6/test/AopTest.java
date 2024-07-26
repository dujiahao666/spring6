package com.powernode.spring6.test;

import com.powernode.spring6.service.LaiConfig;
import com.powernode.spring6.service.LaiService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.swing.plaf.PanelUI;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/10 2:11
 * @description:
 */
public class AopTest {
    @Test
    public void testAop(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(LaiConfig.class);
        LaiService laiService = applicationContext.getBean("laiService", LaiService.class);
        laiService.add();
    }
}
