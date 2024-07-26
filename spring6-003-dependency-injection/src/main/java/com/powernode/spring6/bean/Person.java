package com.powernode.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/21 16:00
 * @description:
 */
public class Person {
    //注入List集合
    private List<String> names;
    //注入set集合
    private Set<String> addrs;

    //多个电话
    //注入Map集合
    private Map<Integer,String> phone;


    //注入属性类对象
    //Properties本质上也是一个Map集合
    //Properties的父类Hashtalbe,Hashtable实现了Map接口
    private Properties properties;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setPhone(Map<Integer, String> phone) {
        this.phone = phone;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setAddrs(Set<String> addrs) {
        this.addrs = addrs;
    }

    @Override
    public String toString() {
        return "Person{" +
                "names=" + names +
                ", addrs=" + addrs +
                ", phone=" + phone +
                ", properties=" + properties +
                '}';
    }
}
