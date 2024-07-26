package com.powernode.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/10 21:13
 * @description:
 */
public class HouProcesss implements BeanPostProcessor {
 @Override
 public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
  System.out.println("bean后处理器的before方法");
  return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
 }

 @Override
 public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
  System.out.println("after方法走起...");
  return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
 }
}
