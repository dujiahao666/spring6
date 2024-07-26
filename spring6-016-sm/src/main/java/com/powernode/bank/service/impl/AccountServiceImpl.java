package com.powernode.bank.service.impl;

import com.powernode.bank.mapper.AccountMapper;
import com.powernode.bank.pojo.Account;
import com.powernode.bank.service.AccountService;
import jakarta.annotation.Resource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/9 11:58
 * @description:
 */
@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService {

//    @Resource(name = "accountmapper")
    @Autowired
    private AccountMapper accountMapper;

    @Override
    public int save(Account account) {
        return accountMapper.insert(account);
    }

    @Override
    public int deleteByActno(String actno) {
        return accountMapper.delete(actno);
    }

    @Override
    public int modify(Account account) {
        return accountMapper.update(account);
    }

    @Override
    public Account getByActno(String actno) {
        return accountMapper.selectByActno(actno);
    }

    @Override
    public List<Account> getAll() {
        return accountMapper.selectAll();
    }

    @Override
    public void transfer(String fromActno, String toActno, double money) {
        Account account = accountMapper.selectByActno(fromActno);
        if (account.getBalance() < money) {
            throw new RuntimeException("余额不足");
        }
        Account account1 = accountMapper.selectByActno(toActno);
        account.setBalance(account.getBalance() - money);
        account1.setBalance(account1.getBalance() + money);
        int count = accountMapper.update(account);
        count += accountMapper.update(account1);
        if(count!=2){
            throw new RuntimeException("转账失败，请联系银行");
        }
    }
}
