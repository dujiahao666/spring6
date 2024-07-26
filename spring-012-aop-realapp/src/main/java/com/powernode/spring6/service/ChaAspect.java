package com.powernode.spring6.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 19:25
 * @description:
 */
@Component
@Aspect
public class ChaAspect {
    @Around("execution(* com.powernode.spring6.service..*(..))")
    public void jia(ProceedingJoinPoint joinPoint){

        try {
            System.out.println("开启事务");
            joinPoint.proceed();
            System.out.println("提交事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");
            throw new RuntimeException(e);
        }
    }
}
