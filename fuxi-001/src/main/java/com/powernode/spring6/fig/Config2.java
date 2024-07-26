package com.powernode.spring6.fig;

import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/9 9:38
 * @description:
 */
@Configuration
@ComponentScan("com.powernode.spring6")
@EnableTransactionManagement
@EnableAspectJAutoProxy

public class Config2 {
    @Bean("as")
    public String ing(){
        return  new String("士大夫");
    }

}
