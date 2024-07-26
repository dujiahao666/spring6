package com.powernode.spring6.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/7 21:22
 * @description:
 */
//@Component
//    @Repository
//    @Service
//    @Controller
public class User {
    private String name;

    public User() {
        System.out.println("第一步：bean的实例化");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("第二部，bean的属性赋值");
    }

    public void star(){
        System.out.println("第四步：这是我的init方法");
    }

    public void end(){
        System.out.println("第七步：这是我的结束方法");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

}
