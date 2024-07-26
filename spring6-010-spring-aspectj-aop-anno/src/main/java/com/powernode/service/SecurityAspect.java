package com.powernode.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 14:41
 * @description:
 */
@Component
@Aspect
@Order(-1)
public class SecurityAspect {  //安全切面

    //通知+切点
//    @Before("execution(* com.powernode.service..*(..))")
    @Before("com.powernode.service.LogAspect.通用切点()")
    public void beforeAdvice(){
        System.out.println("前置通知：【安全】");
    }

}
