package com.powernode.simplefactory;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/22 19:45
 * @description:工厂类角色
 */
public class WeaponFactory {

    /**
     * 静态方法。要获取什么产品？就看你传什么参数，传TANK获取坦克，传DAGGER获取匕首，传FIGHTER获取战斗机。
     * 简单工厂模式中有一个静态方法，所有被称为:静态工厂方法模式
     * @param weaponType 传过来的武器的名字
     * @return
     */
    public static Weapon get(String weaponType){
        if("TANK".equals(weaponType)){
            return new Tank();
        }else  if("DAGGER".equals(weaponType)){
            return  new Dagger();
        }else if("FIGHTER".equals(weaponType)){
            return new Fighter();
        }else {
            throw  new RuntimeException("不支持该武器的生产");
        }
    }
}
