package com.powernode.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/10 2:08
 * @description:
 */
@Component
@Aspect
@Order(1)
public class LaiAS {
    @Before("execution(* com.powernode.spring6.service.LaiService.*(..))")
    public void c1(){
        System.out.println("这是前置通知");
    }

    @Before("execution(* com.powernode.spring6.service.LaiService.*(..))")
    public void c2(){
        System.out.println("这是前置通知2");
    }

}
