package com.powernode.factory.method;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/22 23:31
 * @description: 具体工厂角色
 */
public class GunFactory extends WeaponFactory{
    @Override
    public  Weapon get() {
        return  new Gun();
    }
}
