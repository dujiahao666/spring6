package com.powernode.bank.pojo;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/5/10 8:14
 * @description:
 */
public class Student {
    private String stuName;
    private int stuAge;

    public Student() {
    }

    public Student(String stuName, int stuAge) {
        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    /**
     * 获取
     *
     * @return stuName
     */
    public String getStuName() {
        return stuName;
    }

    /**
     * 设置
     *
     * @param stuName
     */
    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    /**
     * 获取
     *
     * @return stuAge
     */
    public int getStuAge() {
        return stuAge;
    }

    /**
     * 设置
     *
     * @param stuAge
     */
    public void setStuAge(int stuAge) {
        this.stuAge = stuAge;
    }

    public String toString() {
        return "Student{stuName = " + stuName + ", stuAge = " + stuAge + "}";
    }
}
