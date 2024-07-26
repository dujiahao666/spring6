package com.powernode.factory.method;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/22 23:30
 * @description:
 */
public class DaggerFactory extends WeaponFactory{
    @Override
    public Weapon get() {
        return new Dagger();
    }

}
