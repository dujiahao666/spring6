package com.powernode.spring6.service;

import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 19:21
 * @description:
 */
@Component
public class AccountService {

    //转账的业务方法
    public void transfer(){
        System.out.println("银行账户正在完成转账操作...");
    }

    //取款的业务方法
    public void withdarw(){
        System.out.println("正在取款，请稍后...");
    }
}
