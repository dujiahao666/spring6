package com.powernode.bank.mapper;

import com.powernode.bank.pojo.Student;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/10 8:16
 * @description:
 */
public interface StudentMapper {
    Student slectByName(String name);

    List<Student> selectAll();
}
