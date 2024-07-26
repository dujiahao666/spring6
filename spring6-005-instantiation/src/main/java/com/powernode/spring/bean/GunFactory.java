package com.powernode.spring.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 8:09
 * @description: 工厂方法模式当中的:具体工厂角色
 */
public class GunFactory {
    //工厂方法模式中的具体工厂角色中的方法是：实例方法
    public Gun get22() {
        //实际上new 这个对象还是我们程序员自己new的
        return new Gun();
    }
}
