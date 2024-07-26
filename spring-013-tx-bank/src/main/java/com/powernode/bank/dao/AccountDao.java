package com.powernode.bank.dao;

import com.powernode.bank.pojo.Account;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 23:43
 * @description: 专门负责账户信息的CRUD
 */
public interface AccountDao {
 //根据账号查询账户信息
 Account selectByAccount(String actno);

 //更新账户信息
 int update(Account account);

 int insert(Account act);
}
