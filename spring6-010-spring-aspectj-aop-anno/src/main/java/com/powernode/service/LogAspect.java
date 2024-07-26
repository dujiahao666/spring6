package com.powernode.service;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/5 13:02
 * @description:
 */
@Aspect
@Component
@Order(2)
public class LogAspect {  //切面

//    @Before("execution(* com.powernode.service..*(..))")
    @Before("通用切点()")
    //切面=通知 ＋ 切点
    public void jia(JoinPoint joinPoint) {
        System.out.println("我是一个通知，我是一段增强代码...【前置】");
        Signature signature = joinPoint.getSignature();
        System.out.println(signature.getName());  //目标方法的方法名
    }




    //环绕通知（环绕是最大的通知，在前置通知之前，在后置通知之后，也在最终之后）
//    @Around("execution(* *(..))")
    @Around("通用切点()")
    public void aroun(ProceedingJoinPoint joinPoint) {
        try {
            //前面代码
            System.out.println("这就是最开始");
            //执行目标
            joinPoint.proceed();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
        //后面代码
        System.out.println("这就是结束");
       /* System.out.println(joinPoint.getSignature().getDeclaringType()); //获取所在类名
        System.out.println(joinPoint.getSignature().getModifiers()); //方法修饰符
        System.out.println(joinPoint.getSignature().getName()); //返回的是方法名
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());  //也一样，返回所在类*/
    }


    @AfterReturning("execution(* com.powernode.service..*(..))")
    public void hou(){
        System.out.println("我是【后置】通知");
    }

    @After("execution(* com.powernode.service..*(..))")
    public void end(){
        System.out.println("结束了伙计【最终】");
    }

    @AfterThrowing("execution(* com.powernode.service..*(..))")
    public void wen(){
        System.out.println("出问题了，那就到头了...");
    }



    @Pointcut("execution(* com.powernode.service..*(..))")
    public void 通用切点(){
        //这个方法只是一个标记,方法名随意，方法体中也不需要写任何代码
    }
}
