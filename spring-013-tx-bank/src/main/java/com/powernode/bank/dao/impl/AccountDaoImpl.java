package com.powernode.bank.dao.impl;

import com.powernode.bank.dao.AccountDao;
import com.powernode.bank.pojo.Account;
import jakarta.annotation.Resource;
import jakarta.annotation.Resources;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 23:46
 * @description:
 */
@Repository("accountDao")
public class AccountDaoImpl implements AccountDao {
    @Resource(name = "jdbcTemplate")
    private JdbcTemplate jdbcTemplate;

    @Override
    public Account selectByAccount(String actno) {
        String sql = "select actno,balance from t_act where actno=?";
        Account account = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(Account.class), actno);
        return account;
    }

    @Override
    public int update(Account account) {
        String sql = "update t_act set balance=? where actno=?";
        int count = jdbcTemplate.update(sql, account.getBalance(), account.getActno());
        return count;
    }

    @Override
    public int insert(Account act) {
        String sql = "insert into t_act values(?,?)";
        return jdbcTemplate.update(sql, act.getActno(), act.getBalance());
    }
}
