package com.powernode.bank.service.impl;

import com.powernode.bank.mapper.StudentMapper;
import com.powernode.bank.pojo.Student;
import com.powernode.bank.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/10 8:19
 * @description:
 */
@Service("studnetService")
@Transactional
public class StudnetServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studnetMapper;

    @Override
    public Student selectByName(String name) {
        return  studnetMapper.slectByName(name);
    }

    @Override
    public List<Student> selectAll() {
        return studnetMapper.selectAll();
    }
}
