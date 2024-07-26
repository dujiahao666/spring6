package com.powernode.spring6.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/10 2:10
 * @description:
 */
@Configuration
@ComponentScan("com.powernode.spring6")
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class LaiConfig {
}
