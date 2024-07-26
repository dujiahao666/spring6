package com.powernode.spring6.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/9 16:14
 * @description:
 */
@ComponentScan
@Aspect
public class Asdf {

    @Around("execution(* *(..))")
    public void asd(ProceedingJoinPoint joinPoint) throws Throwable {
        String name = joinPoint.getSignature().getName();
        joinPoint.proceed();
    }
}
