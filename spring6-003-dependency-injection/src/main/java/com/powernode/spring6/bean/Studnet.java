package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/21 12:55
 * @description:
 */
public class Studnet {
    private String name;

    //学生属于哪个班级
    private Clazz clazz;

    public void setClazz(Clazz clazz) {
        this.clazz = clazz;
    }

    public Clazz getClazz() {
        return clazz;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Studnet{" +
                "name='" + name + '\'' +
                ", clazz=" + clazz +
                '}';
    }
}
