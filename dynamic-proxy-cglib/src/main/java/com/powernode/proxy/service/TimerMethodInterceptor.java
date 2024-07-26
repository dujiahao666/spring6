package com.powernode.proxy.service;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/4 11:47
 * @description:
 */
public class TimerMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object target, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        long begin = System.currentTimeMillis();
        Object retValue = methodProxy.invoke(target, objects);
        long end = System.currentTimeMillis();
        System.out.println("耗时"+(end-begin)+"毫秒");
        return retValue;
    }
}
