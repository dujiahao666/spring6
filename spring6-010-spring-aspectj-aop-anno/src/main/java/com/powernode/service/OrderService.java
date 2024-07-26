package com.powernode.service;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 14:08
 * @description:
 */

@Component("orderService")
public class OrderService {


    public void generate(){

        System.out.println("生成订单");
        /*if(1==1){
            throw new RuntimeException();
        }*/
    }

}
