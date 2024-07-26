package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/25 13:47
 * @description:简单工厂模式中的工厂类角色
 */
public class StarFactory {
    public static Star get(){
        return new Star();
    }
}
