package com.powernode.spring6.lai;

import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/8 11:08
 * @description:
 */
//@Component
public class Ta implements InterA{
    @Override
    public void kai() {
        System.out.println("a开始操作了");
    }
}
