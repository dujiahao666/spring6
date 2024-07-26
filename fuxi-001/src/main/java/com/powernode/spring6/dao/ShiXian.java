package com.powernode.spring6.dao;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/7 21:46
 * @description:
 */
public class ShiXian implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第三步：bean后处理器的before方法");
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步：bean后处理器的after方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
