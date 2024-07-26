package com.powernode.spring6.test;

import com.powernode.spring6.biz.UserService;
import com.powernode.spring6.biz.VipService;
import com.powernode.spring6.service.AccountService;
import com.powernode.spring6.service.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 19:33
 * @description:
 */
public class TestCe {
    @Test
    public void CeTest(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring6.xml");
        OrderService orderService = applicationContext.getBean("orderService", OrderService.class);
        orderService.generate();
        orderService.cancel();
        AccountService accountService = applicationContext.getBean("accountService", AccountService.class);
        accountService.transfer();
        accountService.withdarw();
    }


    @Test
    public void ce2Test(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring6.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.deleteUser();
        userService.saveUser();
        userService.modifyUser();
        userService.getUser();
        VipService vipService = applicationContext.getBean("vipService", VipService.class);
        vipService.deleteVip();
        vipService.getVip();
        vipService.saveVip();
        vipService.modifyVip();

    }

}
