package com.powernode.spring6.bean3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/28 9:43
 * @description:
 */
@Component
public class User {
    @Value("隔壁老王")
    private String name;
    @Value("42")
    private int age;


    public void setName(String name) {
        this.name = name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public User() {
        System.out.println(name+"  |"+age+"   老王的无参数构造方法执行了");
    }

    public User( String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
