package com.powernode.spring6.fig;

import com.powernode.spring6.fan.Jia;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/8 11:47
 * @description:
 */
@Configuration
@ComponentScan("com.powernode")

public class Config {

    @Bean
    public Jia ka(){
        return new Jia();
    }
    
}
