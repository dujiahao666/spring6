package com.powernode.simplefactory;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/22 23:03
 * @description: 这是客户端程序
 */
public class Test {
    public static void main(String[] args) {
        //需要坦克
        //对于我客户端程序来说，坦克生产的细节，我们不需要关心，我只需要想工厂索要即可
        //简单工厂模式达到了什么呢？职责分离,客户端不需要关心产品的生产细节
        //客户端只负责消费。工厂只负责生产。一个负责生产，一个负责消费。生产者和消费者分离了。这就是简单工厂模式的作用。
        Weapon tank = WeaponFactory.get("TANK");
        tank.attack();
        //需要匕首
        Weapon dagger = WeaponFactory.get("DAGGER");
        dagger.attack();
        //需要战斗机
        Weapon fighter = WeaponFactory.get("FIGHTER");
        fighter.attack();
    }
}
