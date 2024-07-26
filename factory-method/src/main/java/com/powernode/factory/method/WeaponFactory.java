package com.powernode.factory.method;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/22 23:29
 * @description: 抽象工厂角色
 */
public abstract class WeaponFactory {
    /**
     * 这个方法不是静态的，是实例方法
     * @return
     */
    public abstract Weapon get();

}
