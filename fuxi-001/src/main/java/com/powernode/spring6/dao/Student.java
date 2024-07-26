package com.powernode.spring6.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/7/7 22:12
 * @description:
 */
@Component
public class Student {
    @Value("学生的教材都防自学了")
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }
}
