package com.powernode.bank.service;

import com.powernode.bank.pojo.Account;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/9 11:58
 * @description:
 */
public interface AccountService {
    int save(Account account);
    int deleteByActno(String actno);
    int modify(Account account);
    Account getByActno(String actno);
    List<Account> getAll();

    void transfer(String fromActno,String toActno,double money);
}
