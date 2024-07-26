package com.powernode.bank.test;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.dao.impl.AccountDaoImpl;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.impl.AccountServiceImpl;
import com.powernode.bank.service.impl.IsolationService;
import com.powernode.bank.service.impl.IsolationService2;
import com.powernode.bank.service.impl.Spring6Config;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/7 8:39
 * @description:
 */
public class SpringTxTest {

    @Test
    public void testSpringTx() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountServiceImpl accountService = applicationContext.getBean("accountServicepl", AccountServiceImpl.class);
        try {
            accountService.transfer("act-001", "act-002", 10000);
            System.out.println("转账成功！");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


    @Test
    public void testPropagation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        AccountServiceImpl accountService = applicationContext.getBean("accountServicepl", AccountServiceImpl.class);
        Account account = new Account("act-003", 1000.00);
        accountService.save(account);
    }

    @Test
    public void testIsolation() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService i1 = applicationContext.getBean("i1", IsolationService.class);
        i1.getByActno("act-004");
    }

    @Test
    public void testIsolation2() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService2 i2 = applicationContext.getBean("i2", IsolationService2.class);
        i2.insert(new Account("act-004", 888.88));
    }

    @Test
    public void testIsolation3() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        IsolationService2 i2 = applicationContext.getBean("i2", IsolationService2.class);
        i2.insert(new Account("act-008", 888.88));
    }

    @Test
    public void testIsolation4() {
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(Spring6Config.class);
        IsolationService2 i2 = applicationContext.getBean("i2", IsolationService2.class);
        i2.insert(new Account("endle2",666.66));
    }




}
