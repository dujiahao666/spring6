package com.powernode.bank.service;

import com.powernode.bank.pojo.Student;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/10 8:17
 * @description:
 */
public interface StudentService {
    Student selectByName(String name);
    List<Student> selectAll();
}
