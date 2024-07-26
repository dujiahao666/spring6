package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionTimedOutException;
import org.springframework.transaction.UnexpectedRollbackException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeoutException;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/7 22:46
 * @description:
 */
@Service("i2")
public class IsolationService2 {
    @Resource(name = "accountDao")
    private AccountDao accountDao;

    //2号 负责插入
   @Transactional(timeout = 5)
    public void insert(Account account){
       /* try {
            Thread.sleep(1000*4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }*/

       accountDao.insert(account);
       /*try {
           String str=null;
           str.toString();
       } catch (NullPointerException e) {
           throw new RuntimeException(e);
       }*/

   }


    @Transactional(readOnly = true)
    public void sele(String act){
        Account account = accountDao.selectByAccount(act);
        System.out.println(account);
    }


}
