package com.powernode.bank.service.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 23:56
 * @description:
 */
@Service("accountServicepl")
//@Transactional
public class AccountServiceImpl implements AccountService {
    @Resource(name = "accountDao")
    private AccountDao accountDao;


    //控制事务，因为在这个方法中要完成所有的转账事务
    @Override
    @Transactional
    public void transfer(String fromActno, String toActno, double money) {
        Account account = accountDao.selectByAccount(fromActno);
        if (account.getBalance() < money) {
            throw new RuntimeException("余额不足！！！");
        }
        Account account1 = accountDao.selectByAccount(toActno);
        //改变内存
        account.setBalance(account.getBalance() - money);
        account1.setBalance(account1.getBalance() + money);
        //改变数据库
        int count = accountDao.update(account);


        //模拟异常
        String str = null;
        str.toString();


        count += accountDao.update(account1);
        if (count != 2) {
            throw new RuntimeException("转账失败，联系银行！");
        }
    }


    @Transactional(propagation = Propagation.REQUIRED)
    public void withdraw() {

    }


    @Resource(name = "accountService2")
    private AccountService accountService;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account account) {
        //这里调用dao的insert方法
        accountDao.insert(account);
        //创建账号对象
        Account act2 = new Account("act-004", 1000.0);
        try {
            accountService.save(act2);
        } catch (Exception e) {
            System.out.println("出问题了........");
//            throw new RuntimeException(e);
        }
        String s=null;
        s.toString();
    }
}
