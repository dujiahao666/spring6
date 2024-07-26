package com.powernode.spring6.bean;

/**
 * @author 杜嘉豪
 * @version 1.0
 * @create 2024/4/24 21:22
 * @description:
 */
public class Husband {
    private String name;
    private Wife wife;

    public Husband() {
        System.out.println("丈夫无参数构造方法执行了");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWife(Wife wife) {
        this.wife = wife;
    }

    public String getName() {
        return name;
    }

    public Wife getWife() {
        return wife;
    }


    @Override
    public String toString() {
        return "Husband{" +
                "name='" + name + '\'' +
                ", wife=" + wife.getName() +
                '}';
    }
}
