package com.powernode.simplefactory;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/22 19:39
 * @description:具体产品角色
 */
public class Tank extends Weapon{
    @Override
    public void attack() {
        System.out.println("坦克开炮！！！");
    }
}
