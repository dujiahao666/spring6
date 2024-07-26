package com.powernode.spring6.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 15:41
 * @description: 日志Bean后处理器
 */
public class LogBeanpostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第三步：执行Bean后处理器的before方法。当前名字"+beanName);
        return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
    }


    /**
     *
     * @param bean  刚刚创建的bean对象
     * @param beanName  bean的名字
     * @return
     * @throws BeansException
     * 方法有两个参数
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("第五步：执行Bean后处理器的after方法");
        return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
    }
}
