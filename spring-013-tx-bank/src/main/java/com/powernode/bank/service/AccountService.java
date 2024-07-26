package com.powernode.bank.service;

import com.powernode.bank.pojo.Account;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 23:53
 * @description:
 */
public interface AccountService {

 void transfer(String fromActno,String toActno,double money);


 /**
  * 保存账户信息
  * @param account
  */
 void save(Account account);
}
