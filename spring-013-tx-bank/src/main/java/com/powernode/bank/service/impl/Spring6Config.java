package com.powernode.bank.service.impl;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/8 22:51
 * @description:
 */
@Configuration
@ComponentScan("com.powernode")
@EnableTransactionManagement
@EnableAspectJAutoProxy
public class Spring6Config {
    @Bean("datasource")
    public DruidDataSource getDsa(){
        DruidDataSource druidDataSource=new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3307/spring6");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");
        return druidDataSource;
    }

    @Bean("jdbcTemplate")
    public JdbcTemplate getJD( DataSource dataSource){
        JdbcTemplate jdbcTemplate=new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return  jdbcTemplate;
    }

    @Bean("txManager")
    public DataSourceTransactionManager getdara( DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

}
