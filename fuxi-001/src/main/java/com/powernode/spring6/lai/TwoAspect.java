package com.powernode.spring6.lai;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/9 9:28
 * @description:
 */
@Component
@Aspect
@Order
public class TwoAspect {

    @Before("com.powernode.spring6.fan.AllAspect.qie()")
    public void kai(){}
}
