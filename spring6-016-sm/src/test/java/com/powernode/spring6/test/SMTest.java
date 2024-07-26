package com.powernode.spring6.test;

import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import com.powernode.bank.service.StudentService;
import com.powernode.bank.service.impl.AccountServiceImpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/9 12:50
 * @description:
 */
public class SMTest {
    @Test
    public void testSM() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer("act-001", "act-002", 10000);
    }


    @Test
    public void testSM2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        StudentService studnetService = applicationContext.getBean("studnetService", StudentService.class);
        studnetService.selectAll();
    }
}
