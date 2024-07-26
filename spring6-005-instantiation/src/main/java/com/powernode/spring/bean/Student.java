package com.powernode.spring.bean;

import java.util.Date;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/23 9:17
 * @description:
 */
public class Student {
    //java.util.Date  在Spring当中被仿作简单类型。但是简单类型的话，注入的日期字符串格式有要求
    //java.util.Date  在Spring当中也可以被当做非简单类型。
    private Date birth;


    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birth=" + birth +
                '}';
    }
}
