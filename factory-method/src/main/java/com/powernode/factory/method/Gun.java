package com.powernode.factory.method;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/22 23:28
 * @description:具体产品角色
 */
public class Gun extends Weapon{
    @Override
    public void attack() {
        System.out.println("开枪射击！！！");
    }
}
