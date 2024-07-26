package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.io.PrintWriter;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/7 22:46
 * @description:
 */
@Service("i1")
public class IsolationService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;


    //1号 负责查询
   @Transactional(isolation = Isolation.READ_UNCOMMITTED)
    public void getByActno(String actno){
        Account account = accountDao.selectByAccount(actno);
        System.out.println(" 查询到的账户信息："+account);
    }
}
