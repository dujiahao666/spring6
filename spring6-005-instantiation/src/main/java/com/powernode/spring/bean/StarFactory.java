package com.powernode.spring.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 0:23
 * @description: 简单工厂模式中的工厂类角色。星工厂
 */
public class StarFactory {
    //工厂类中有一个静态方法
    //简单工厂模式又叫做：静态工厂方法模式
    public static Star get(){
        //这个Star对象最终实际上创建的时候还是我们负责new的对象
        return new Star();
    }
}
