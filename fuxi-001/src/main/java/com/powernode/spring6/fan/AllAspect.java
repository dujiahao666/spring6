package com.powernode.spring6.fan;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Bean;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.swing.plaf.PanelUI;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/9 8:47
 * @description:
 */
@Component
@Aspect
@Order
public class AllAspect {
    //    @Before("execution(* *(..))")
   /* public void zhixing(){
        System.out.println("前置触发");
    }*/
    @Before("qie()")
    public void zhixing(JoinPoint joinPoint) {
        System.out.println("前置触发");
        System.out.println(joinPoint.getSignature().getName());
//        String string = joinPoint.getSignature().toString();
//        String[] split = string.split("\\.");
//        System.out.println(split[split.length-1]);
    }

    @Pointcut("execution(public void com.powernode.spring6..method*(..))")
    public void qie() {
    }

    @AfterReturning("execution(public void com.powernode.spring6..method*(..))")
    public void qie2(){
        System.out.println("后置通知");
    }

    @After("execution(public void com.powernode.spring6..method*(..))")
    public void qie3(){
        System.out.println("最终通知");
    }

    @Around("execution(public void com.powernode.spring6..method*(..))")
    public void qie4(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前环绕");
        joinPoint.proceed();
        System.out.println("后环绕");
    }

    @AfterThrowing("execution(public void com.powernode.spring6..method*(..))")
    public void qie5(){
        System.out.println("异常处理方法");
    }


}
