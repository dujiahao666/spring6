package com.powernode.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/10 2:00
 * @description:
 */
@Component
public class LaiService {
    @Autowired
    private LaiDao laiDao;


    @Transactional()
    public void add(){
        laiDao.insert();
    }

}
