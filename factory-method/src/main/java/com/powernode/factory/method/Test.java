package com.powernode.factory.method;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/22 23:35
 * @description: 客户端程序
 */
public class Test {
    public static void main(String[] args) {
        /*Weapon dagger = new DaggerFactory().get();
        dagger.attack();
        Weapon gun = new GunFactory().get();
        gun.attack();*/
        WeaponFactory daggerFactory=new DaggerFactory();      //多态返回
        DaggerFactory daggerFactory1 = new DaggerFactory();  //构造方法返回
        Weapon weapon = daggerFactory.get();
        Weapon weapon2 = daggerFactory.get();
        weapon2.attack();
        weapon.attack();
    }
}
