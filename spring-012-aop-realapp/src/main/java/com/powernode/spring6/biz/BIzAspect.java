package com.powernode.spring6.biz;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 19:50
 * @description:
 */
@Component
@Aspect
public class BIzAspect {
    @Pointcut("execution(* com.powernode.spring6.biz..save*(..))")
    public void save(){}

    @Pointcut("execution(* com.powernode.spring6.biz..delete*(..))")
    public void delete(){}

    @Pointcut("execution(* com.powernode.spring6.biz..modify*(..))")
    public void modify(){}

    @Before("save() || delete() || modify()")
    public void beforeAdvice(JoinPoint joinPoint){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = simpleDateFormat.format(new Date());
        String name = joinPoint.getSignature().getName();
        System.out.println("张三在:"+format+"操作了："+joinPoint.getSignature().getDeclaringTypeName()+"."+name+"方法");
    }
}
