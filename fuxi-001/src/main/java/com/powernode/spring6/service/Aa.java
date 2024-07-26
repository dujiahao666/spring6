package com.powernode.spring6.service;

import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/18 23:17
 * @description:
 */
@Component
public class Aa {
    @Resource
    private Bb bb;

    public void ce2(){
        bb.ce();
    }

}
