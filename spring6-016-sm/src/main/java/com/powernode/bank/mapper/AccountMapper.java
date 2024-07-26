package com.powernode.bank.mapper;

import com.powernode.bank.pojo.Account;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/9 11:37
 * @description:
 */
//@Repository("accountmapper")
public interface AccountMapper {   //该接口的实现类是动态生成的，是mybatis通过动态代理机制生成的实现类
    //这就是dao,只需要编写crud方法就可以了
    int insert(Account account);
    int delete(String actno);
    int update(Account account);
    Account selectByActno(String actno);
    List<Account> selectAll();
}
