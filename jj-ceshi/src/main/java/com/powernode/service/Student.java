package com.powernode.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/6 16:38
 * @description:
 */
@Component("stu")
public class Student {
    @Value("嘉嘉")
    private String name;
    @Value("21")
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void c1(){
        System.out.println(name+"开始操作了");
    }

    public void c2(){
        System.out.println("age是："+age);
    }
}
