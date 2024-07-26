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
 * @create 2024/5/7 19:46
 * @description:
 */
@Service("accountService2")
public class AccountServiceImpl2 implements AccountService {

    @Resource(name = "accountDao")
    private AccountDao accountDao;
    @Override
    public void transfer(String fromActno, String toActno, double money) {

    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public void save(Account account) {
        accountDao.insert(account);
        //模拟异常
        /*String s=null;
        s.toString()*/;
    }
}
