package com.powernode.service;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 15:24
 * @description:
 */
@Configuration
@ComponentScan("com.powernode.service")
@EnableAspectJAutoProxy(proxyTargetClass = false)
public class Quan {
}
