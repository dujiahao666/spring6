package com.powernode.spring6.lai;

import jakarta.annotation.Resource;
import jakarta.annotation.Resources;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/8 11:08
 * @description:
 */
@Component
public class InterAimpl {
//    @Autowired
//    @Qualifier("ta")
    @Resource()
    private InterA inaa;


    public void setInaa(InterA inaa) {
        this.inaa = inaa;
    }


//    public InterAimpl(){}



    public void ce(){
        inaa.kai();
    }

}
